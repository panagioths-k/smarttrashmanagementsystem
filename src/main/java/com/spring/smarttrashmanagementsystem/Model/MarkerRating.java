package com.spring.smarttrashmanagementsystem.Model;

public enum MarkerRating {

    HUE_GREEN(120.0F),
    HUE_YELLOW(60.0F),
    HUE_RED(0.0F);

    public final Float value;

    private MarkerRating(Float value) {
        this.value = value;
    }
}
