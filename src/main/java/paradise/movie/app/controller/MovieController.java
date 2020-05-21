package paradise.movie.app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
import paradise.movie.app.model.Movie;
import paradise.movie.app.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getMovies(
            @RequestParam("genre") String genre,
            @RequestParam("actor") String actor
    ) {
        System.out.println(genre);
        System.out.println(actor);
        return movieService.getComing(10, 0);
    }

    @PutMapping("")
    public void updateMovie() {
        movieService.update(new Movie());
    }

    @GetMapping("/today")
    public List<Movie> getToday() throws JsonProcessingException {
        return movieService.getToday();
    }

    @GetMapping("/newest")
    public List<Movie> getNewest() {
        return movieService.getNewest(10, 0);
    }

    @GetMapping("/coming")
    public List<Movie> getComing() {
        return movieService.getComing(10, 0);
    }

    @GetMapping("/{path}")
    public Movie findByPath(@PathVariable("path") String path) {
        return movieService.findByPath(path);
    }
}
