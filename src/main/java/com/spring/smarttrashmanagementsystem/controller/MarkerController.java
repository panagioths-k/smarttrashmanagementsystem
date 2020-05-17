package com.spring.smarttrashmanagementsystem.controller;

import com.spring.smarttrashmanagementsystem.Model.MarkerRating;
import com.spring.smarttrashmanagementsystem.dto.MarkerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MarkerController {

    @RequestMapping(method = RequestMethod.GET, value = "/markers", produces = "application/json")
    public ResponseEntity<List<MarkerDto>> getMarkers() {

        MarkerDto m1 = new MarkerDto(40.631412, 22.943392, MarkerRating.HUE_GREEN);
        MarkerDto m2 = new MarkerDto(40.635939, 22.940673, MarkerRating.HUE_RED);
        MarkerDto m3 = new MarkerDto(40.636525, 22.942713, MarkerRating.HUE_YELLOW);
        MarkerDto m4 = new MarkerDto(40.634294, 22.942801, MarkerRating.HUE_GREEN);
        MarkerDto m5 = new MarkerDto(40.632568, 22.943123, MarkerRating.HUE_GREEN);
        MarkerDto m6 = new MarkerDto(40.635890, 22.945828, MarkerRating.HUE_RED);
        MarkerDto m7 = new MarkerDto(40.636183, 22.952313, MarkerRating.HUE_GREEN);
        MarkerDto m8 = new MarkerDto(40.632242, 22.954632, MarkerRating.HUE_RED);
        MarkerDto m9 = new MarkerDto(40.632088, 22.951764, MarkerRating.HUE_GREEN);

        List<MarkerDto> markers = new ArrayList<>();
        markers.addAll(Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9));
        return new ResponseEntity<>(markers, HttpStatus.OK);
    }
}
