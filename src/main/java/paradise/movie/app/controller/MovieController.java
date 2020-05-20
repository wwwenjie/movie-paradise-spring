package paradise.movie.app.controller;

import org.springframework.web.bind.annotation.*;
import paradise.movie.app.model.Movie;
import paradise.movie.app.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public Movie[] getMovies(
            @RequestParam("genre") String genre,
            @RequestParam("actor") String actor
    ) {
        System.out.println(genre);
        System.out.println(actor);
        return movieService.getToday();
    }

    @PutMapping("")
    public void updateMovie() {
        movieService.update();
    }

    @GetMapping("/today")
    public Movie[] getToday() {
        return movieService.getToday();
    }

    @GetMapping("/newest")
    public Movie[] getNewest() {
        return movieService.getNewest();
    }

    @GetMapping("/coming")
    public Movie[] getComing() {
        return movieService.getComing();
    }

    @GetMapping("/{path}")
    public Movie findByPath(@PathVariable("path") String path) {
        return movieService.findByPath(path);
    }
}
