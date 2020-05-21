package paradise.movie.app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
import paradise.movie.app.model.Movie;
import paradise.movie.app.service.MovieService;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getMovies(String genre, String actor, String ids, String keyword, Integer limit, Integer offset) {
        if (keyword != null) {
            return movieService.search(keyword);
        }
        if (ids != null) {
            return movieService.findByIds(ids);
        }
        if (genre != null) {
            return movieService.findByGenre(genre, limit, offset);
        }
        if (actor != null) {
            return movieService.findByActor(actor, limit, offset);
        }
        return null;
    }

    @GetMapping("/today")
    public List<Movie> getToday() throws JsonProcessingException {
        return movieService.getToday();
    }

    @GetMapping("/newest")
    public List<Movie> getNewest(Integer limit, Integer offset) {
        return movieService.getNewest(limit, offset);
    }

    @GetMapping("/coming")
    public List<Movie> getComing(Integer limit, Integer offset) {
        return movieService.getComing(limit, offset);
    }

    @GetMapping("/{path}")
    public Movie findByPath(@PathVariable("path") String path) {
        return movieService.findByPath(path);
    }
}
