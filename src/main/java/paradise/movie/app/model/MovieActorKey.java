package paradise.movie.app.model;

public class MovieActorKey {
    private Integer movieId;

    private Integer actorId;

    public MovieActorKey(Integer movieId, Integer actorId) {
        this.movieId = movieId;
        this.actorId = actorId;
    }

    public MovieActorKey() {
        super();
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
}