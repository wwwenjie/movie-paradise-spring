package paradise.movie.app.model;

import java.util.Date;

public class Movie {
    private Integer id;

    private String imdbId;

    private String title;

    private String titleEn;

    private Integer year;

    private Date release;

    private String poster;

    private String path;

    private Date createTime;

    private Date updateTime;

    private String info;

    private String rating;

    private String recs;

    private String trailers;

    private String backdrops;

    public Movie(Integer id, String imdbId, String title, String titleEn, Integer year, Date release, String poster, String path, Date createTime, Date updateTime) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.titleEn = titleEn;
        this.year = year;
        this.release = release;
        this.poster = poster;
        this.path = path;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Movie(Integer id, String imdbId, String title, String titleEn, Integer year, Date release, String poster, String path, Date createTime, Date updateTime, String info, String rating, String recs, String trailers, String backdrops) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.titleEn = titleEn;
        this.year = year;
        this.release = release;
        this.poster = poster;
        this.path = path;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.info = info;
        this.rating = rating;
        this.recs = recs;
        this.trailers = trailers;
        this.backdrops = backdrops;
    }

    public Movie() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId == null ? null : imdbId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster == null ? null : poster.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", titleEn='" + titleEn + '\'' +
                ", year=" + year +
                ", release=" + release +
                ", poster='" + poster + '\'' +
                ", path='" + path + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", info='" + info + '\'' +
                ", rating='" + rating + '\'' +
                ", recs='" + recs + '\'' +
                ", trailers='" + trailers + '\'' +
                ", backdrops='" + backdrops + '\'' +
                '}';
    }
}