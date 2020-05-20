package paradise.movie.app.model;

public class Genre {
    private Integer genreId;

    private String name;

    private String nameEn;

    public Genre(Integer genreId, String name, String nameEn) {
        this.genreId = genreId;
        this.name = name;
        this.nameEn = nameEn;
    }

    public Genre() {
        super();
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
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
}