package paradise.movie.app.service;

import org.springframework.stereotype.Service;
import paradise.movie.app.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie[] getToday() {
        return new Movie[0];
    }

    @Override
    public Movie[] getNewest() {
        return new Movie[0];
    }

    @Override
    public Movie[] getComing() {
        return new Movie[0];
    }

    @Override
    public Movie[] search() {
        return new Movie[0];
    }

    @Override
    public Movie findByPath(String path) {
        return null;
    }

    @Override
    public Movie[] findByIds() {
        return new Movie[0];
    }

    @Override
    public Movie[] findByGenre() {
        return new Movie[0];
    }

    @Override
    public Movie[] findByActor() {
        return new Movie[0];
    }

    @Override
    public void update() {

    }

    @Override
    public void create() {

    }

    @Override
    public Movie handelGenre() {
        return null;
    }

    @Override
    public Movie handelActor() {
        return null;
    }
}
