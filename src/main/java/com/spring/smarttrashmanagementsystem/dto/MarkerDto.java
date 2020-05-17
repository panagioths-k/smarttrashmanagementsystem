package com.spring.smarttrashmanagementsystem.dto;


import com.spring.smarttrashmanagementsystem.Model.MarkerRating;

public class MarkerDto {

    private String latitude;

    private String longitude;

    private MarkerRating rating;

    public MarkerDto() {
    }

    public MarkerDto(String latitude, String longitude, MarkerRating rating) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public MarkerRating getRating() {
        return rating;
    }

    public void setRating(MarkerRating rating) {
        this.rating = rating;
    }
}
