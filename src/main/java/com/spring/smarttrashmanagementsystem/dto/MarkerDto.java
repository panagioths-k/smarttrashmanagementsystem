package com.spring.smarttrashmanagementsystem.dto;


import com.spring.smarttrashmanagementsystem.Model.MarkerRating;

public class MarkerDto {

    private Double latitude;

    private Double longitude;

    private MarkerRating rating;

    public MarkerDto() {
    }

    public MarkerDto(Double latitude, Double longitude, MarkerRating rating) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public MarkerRating getRating() {
        return rating;
    }

    public void setRating(MarkerRating rating) {
        this.rating = rating;
    }
}
