package com.example.claudy.devoirguide.models;

/**
 * Created by CLAUDY on 6/21/2017.
 */

public class GuideModel {
    private String name;
    private int guide_id;
    private float longitude;
    private float latitude;
    private String adress;
    private String phone;
    private String description;
    private String image;
    private String website;

    public String getMovie() {
        return name;
    }

    public void setMovie(String movie) {
        this.name = movie;
    }

    public int getYear() {
        return guide_id;
    }

    public void setYear(int year) {
        this.guide_id = year;
    }

    public float getRatin() {
        return longitude;
    }

    public void setRatin(float rating) {
        this.longitude = rating;
    }

    public float getRating() {
        return latitude;
    }

    public void setRating(float rating) {
        this.latitude = rating;
    }

    public String getDuration() {
        return adress;
    }

    public void setDuration(String duration) {
        this.adress = duration;
    }

    public String getDirector() {
        return phone;
    }

    public void setDirector(String director) {
        this.phone = director;
    }

    public String getTagline() {
        return description;
    }

    public void setTagline(String tagline) {
        this.description = tagline;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStory() {
        return website;
    }

    public void setStory(String story) {
        this.website = story;
    }


}
