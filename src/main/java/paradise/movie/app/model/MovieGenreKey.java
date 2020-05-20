package paradise.movie.app.model;

public class MovieGenreKey {
    private Integer movieId;

    private Integer genreId;

    public MovieGenreKey(Integer movieId, Integer genreId) {
        this.movieId = movieId;
        this.genreId = genreId;
    }

    public MovieGenreKey() {
        super();
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
}