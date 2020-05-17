package com.spring.smarttrashmanagementsystem.controller;

import com.spring.smarttrashmanagementsystem.Model.MarkerRating;
import com.spring.smarttrashmanagementsystem.dto.MarkerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MarkerController {

    @RequestMapping(method = RequestMethod.GET, value = "/markers", produces = "application/json")
    public ResponseEntity<List<MarkerDto>> getMarkers() {

        MarkerDto m1 = new MarkerDto("40.631412", "22.943392", MarkerRating.HUE_GREEN);
        MarkerDto m2 = new MarkerDto("40.635939", "22.940673", MarkerRating.HUE_RED);
        MarkerDto m3 = new MarkerDto("40.632088", "22.951764", MarkerRating.HUE_YELLOW);

        List<MarkerDto> markers = new ArrayList<>();
        markers.add(m1);
        markers.add(m2);
        markers.add(m3);
        return new ResponseEntity<List<MarkerDto>>(markers, HttpStatus.OK);
    }
}
