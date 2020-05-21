package paradise.movie.app.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import paradise.movie.app.model.Movie;

import java.util.List;

@Component
public interface MovieDao {
    List<Movie> getToday();

    List<Movie> getNewest(@Param("limit") Integer limit, @Param("offset") Integer offset);

    List<Movie> getComing(@Param("limit") Integer limit, @Param("offset") Integer offset);

    List<Movie> search(@Param("keyword") String keyword);

    Movie findByPath(@Param("path") String path);

    List<Movie> findByIds(@Param("ids") String[] ids);

    List<Movie> findByGenre(@Param("genre") String genre, @Param("limit") Integer limit, @Param("offset") Integer offset);

    List<Movie> findByActor(@Param("actor") String genre, @Param("limit") Integer limit, @Param("offset") Integer offset);

    void update(Movie movie);

    void create(Movie movie);

    Movie handelGenre(Movie movie);

    Movie handelActor(Movie movie);
}