package paradise.movie.app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import paradise.movie.app.MovieParadiseApplicationTests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ImprovementServiceTest extends MovieParadiseApplicationTests {
    @Autowired
    ImprovementService improvementService;

    @Test
    void patchPoster() throws IOException {
        improvementService.patchPoster(6717575);
    }

    @Test
    void patchBackdrops() throws IOException {
        improvementService.patchBackdrops("crash-2004");
    }

    @Test
    void patchTrailers() throws IOException {
        improvementService.patchTrailers(1388216);
    }
}