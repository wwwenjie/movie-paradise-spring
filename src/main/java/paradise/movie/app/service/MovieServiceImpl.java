package paradise.movie.app.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import paradise.movie.app.dao.MovieDao;
import paradise.movie.app.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    public final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> getToday() {
        List<Movie> movies = movieDao.getToday();
        List<Movie> qualifiedMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating() == null) continue;
            JSONObject jsonObject = JSONObject.parseObject(movie.getRating());
            double douban = jsonObject.getDoubleValue("douban_score");
            double imdb = jsonObject.getDoubleValue("imdb_score");
            if (douban > 8.0 || imdb > 8.0) {
                if (qualifiedMovies.size() == 10) break;
                qualifiedMovies.add(movie);
            }
        }
        return qualifiedMovies;
    }

    @Override
    public List<Movie> getNewest(Integer limit, Integer offset) {
        limit = limit == null ? 8 : limit;
        offset = offset == null ? 0 : offset;
        return movieDao.getNewest(limit, offset);
    }

    @Override
    public List<Movie> getComing(Integer limit, Integer offset) {
        limit = limit == null ? 8 : limit;
        offset = offset == null ? 0 : offset;
        return movieDao.getComing(limit, offset);
    }

    @Override
    public List<Movie> search(String keyword) {
        return movieDao.search(keyword);
    }

    @Override
    public Movie findByPath(String path) {
        return movieDao.findByPath(path);
    }

    @Override
    public List<Movie> findByIds(String ids) {
        return movieDao.findByIds(ids.split("-"));
    }

    @Override
    public List<Movie> findByGenre(String genre, Integer limit, Integer offset) {
        limit = limit == null ? 8 : limit;
        offset = offset == null ? 0 : offset;
        return movieDao.findByGenre(genre, limit, offset);
    }

    @Override
    public List<Movie> findByActor(String actor, Integer limit, Integer offset) {
        limit = limit == null ? 8 : limit;
        offset = offset == null ? 0 : offset;
        return movieDao.findByActor(actor, limit, offset);
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void create(Movie movie) {

    }

    @Override
    public Movie handelGenre(Movie movie) {
        return null;
    }

    @Override
    public Movie handelActor(Movie movie) {
        return null;
    }
}
