package paradise.movie.app.service;

import org.springframework.stereotype.Service;
import paradise.movie.app.model.Movie;

@Service
public interface MovieService {
    Movie[] getToday();

    Movie[] getNewest();

    Movie[] getComing();

    Movie[] search();

    Movie findByPath(String path);

    Movie[] findByIds();

    Movie[] findByGenre();

    Movie[] findByActor();

    void update();

    void create();

    Movie handelGenre();

    Movie handelActor();
}
