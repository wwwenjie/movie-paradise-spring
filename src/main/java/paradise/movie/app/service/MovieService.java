package paradise.movie.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import paradise.movie.app.model.Movie;

import java.util.List;

@Service
public interface MovieService {
    List<Movie> getToday() throws JsonProcessingException;

    List<Movie> getNewest(Integer limit, Integer offset);

    List<Movie> getComing(Integer limit, Integer offset);

    List<Movie> search(String keyword);

    Movie findByPath(String path);

    List<Movie> findByIds(String ids);

    List<Movie> findByGenre(String genre, Integer limit, Integer offset);

    List<Movie> findByActor(String actor, Integer limit, Integer offset);

    void update(Movie movie);

    void create(Movie movie);

    Movie handelGenre(Movie movie);

    Movie handelActor(Movie movie);
}
