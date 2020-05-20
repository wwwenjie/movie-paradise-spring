package paradise.movie.app.model;

public class MovieActor {
    private Integer movieId;

    private Integer actorId;

    public MovieActor(Integer movieId, Integer actorId) {
        this.movieId = movieId;
        this.actorId = actorId;
    }

    public MovieActor() {
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