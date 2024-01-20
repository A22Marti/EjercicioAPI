package com.example.actividadapi;

public class MovieModelClass {
    String id;
    String name;
    String img;

    String movieId;

    String overview;

    String year;

    String name2;

    String img2;

    public MovieModelClass(String id, String name, String img, String movieId, String overview, String year, String name2, String img2) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.movieId = movieId;
        this.overview = overview;
        this.year = year;
        this.name2 = name2;
        this.img2 = img2;
    }

    public MovieModelClass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }
}
