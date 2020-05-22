package paradise.movie.app.service;

import org.springframework.stereotype.Service;
import paradise.movie.app.dao.MovieDao;
import paradise.movie.app.model.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * 电影信息接口
 * 功能均为函数字面意思
 * 数据库不设置删除功能，update不允许更新 _id 字段
 */
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
            double douban = movie.getRating().getDoubleValue("douban_score");
            double imdb = movie.getRating().getDoubleValue("imdb_score");
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

    /**
     * 默认限制 15 条数，促使用户精确搜索
     */
    @Override
    public List<Movie> search(String keyword) {
        return movieDao.search(keyword);
    }

    @Override
    public Movie findByPath(String path) {
        return movieDao.findByPath(path);
    }

    /**
     * @param ids：123456-123456-123456
     */
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

    /**
     * 非查询服务均为最低优先级，最后实现
     */
    @Override
    public void update(Movie movie) {
        movieDao.update(movie);
    }

    /**
     * @deprecated
     */
    @Override
    public void create(Movie movie) {

    }

    /**
     * 处理电影信息改动时对应修改关联表(数据库外键约束)
     * movie_genre
     * movie_actor
     */
    @Override
    public Movie handelGenre(Movie movie) {
        return null;
    }

    @Override
    public Movie handelActor(Movie movie) {
        return null;
    }
}
