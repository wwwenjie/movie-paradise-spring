package paradise.movie.app.model;

import java.util.Date;

public class Actor {
    private Integer actorId;

    private String name;

    private String nameEn;

    private String gender;

    private Date birthday;

    private String bornPlace;

    private String summary;

    private String alt;

    public Actor(Integer actorId, String name, String nameEn, String gender, Date birthday, String bornPlace, String summary, String alt) {
        this.actorId = actorId;
        this.name = name;
        this.nameEn = nameEn;
        this.gender = gender;
        this.birthday = birthday;
        this.bornPlace = bornPlace;
        this.summary = summary;
        this.alt = alt;
    }

    public Actor() {
        super();
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace == null ? null : bornPlace.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt == null ? null : alt.trim();
    }
}