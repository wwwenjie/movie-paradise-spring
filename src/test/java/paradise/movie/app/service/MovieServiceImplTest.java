package paradise.movie.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import paradise.movie.app.MovieParadiseApplicationTests;
import paradise.movie.app.dao.MovieDao;
import paradise.movie.app.model.Movie;

import java.util.List;

class MovieServiceImplTest extends MovieParadiseApplicationTests {
    @Autowired
    MovieService movieService;
    @Autowired
    MovieDao movieDao;

    @Test
    void getToday() throws JsonProcessingException {
        movieService.getToday();
    }

    @Test
    void getNewest() {
        movieService.getNewest(5, 0);
    }

    @Test
    void getComing() {
        movieService.getComing(5, 0);
    }

    @Test
    void search() {
        String title = "功夫";
        List<Movie> movies = movieService.search(title);
        Assert.assertEquals(title, movies.get(0).getTitle());
    }

    @Test
    void findByPath() {
        String path = "ff9";
        Movie movie = movieService.findByPath(path);
        Assert.assertEquals(path, movie.getPath());
    }

    @Test
    void findByIds() {
        Integer id = 30299356;
        List<Movie> movies = movieService.findByIds("25964071-30299356");
        Assert.assertEquals(id, movies.get(1).getId());
    }

    @Test
    void findByGenre() {
        movieService.findByGenre("动作", 5, 0);
    }

    @Test
    void findByActor() {
        movieService.findByActor("动作", 5, 0);
    }

    @Test
    void update() {
    }

    @Test
    void create() {
    }

    @Test
    void handelGenre() {
    }

    @Test
    void handelActor() {
    }
}