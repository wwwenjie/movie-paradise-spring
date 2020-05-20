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
}