package paradise.movie.app.model;

import java.util.Date;

public class MovieWithBLOBs extends Movie {
    private String info;

    private String rating;

    private String recs;

    private String trailers;

    private String backdrops;

    public MovieWithBLOBs(Integer id, String imdbId, String title, String titleEn, Integer year, Date release, String poster, String path, Date createTime, Date updateTime, String info, String rating, String recs, String trailers, String backdrops) {
        super(id, imdbId, title, titleEn, year, release, poster, path, createTime, updateTime);
        this.info = info;
        this.rating = rating;
        this.recs = recs;
        this.trailers = trailers;
        this.backdrops = backdrops;
    }

    public MovieWithBLOBs() {
        super();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    public String getRecs() {
        return recs;
    }

    public void setRecs(String recs) {
        this.recs = recs == null ? null : recs.trim();
    }

    public String getTrailers() {
        return trailers;
    }

    public void setTrailers(String trailers) {
        this.trailers = trailers == null ? null : trailers.trim();
    }

    public String getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(String backdrops) {
        this.backdrops = backdrops == null ? null : backdrops.trim();
    }
}