package paradise.movie.app.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class Movie {
    private Integer _id;

    private String imdbId;

    private String title;

    private String titleEn;

    private Integer year;

    private Date release;

    private String poster;

    private String path;

    private Date createTime;

    private Date updateTime;

    private JSONObject info;

    private JSONObject rating;

    private JSONArray recs;

    private JSONArray trailers;

    private JSONArray backdrops;

    public Movie(Integer _id, String imdbId, String title, String titleEn, Integer year, Date release, String poster, String path, Date createTime, Date updateTime) {
        this._id = _id;
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

    public Movie(Integer _id, String imdbId, String title, String titleEn, Integer year, Date release, String poster, String path, Date createTime, Date updateTime, JSONObject info, JSONObject rating, JSONArray recs, JSONArray trailers, JSONArray backdrops) {
        this._id = _id;
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

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
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

    public JSONObject getInfo() {
        return info;
    }

    public void setInfo(JSONObject info) {
        this.info = info;
    }

    public JSONObject getRating() {
        return rating;
    }

    public void setRating(JSONObject rating) {
        this.rating = rating;
    }

    public JSONArray getRecs() {
        return recs;
    }

    public void setRecs(JSONArray recs) {
        this.recs = recs;
    }

    public JSONArray getTrailers() {
        return trailers;
    }

    public void setTrailers(JSONArray trailers) {
        this.trailers = trailers;
    }

    public JSONArray getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(JSONArray backdrops) {
        this.backdrops = backdrops;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + _id +
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