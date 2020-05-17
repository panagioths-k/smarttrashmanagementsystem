package com.spring.smarttrashmanagementsystem.controller;

import com.spring.smarttrashmanagementsystem.repository.ConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contains the main server functionality
 * <p>
 * Accepts and stores consumptions
 */
@Controller
public class ConsumptionController {

//    @Autowired
//    private ConsumptionRepository consumptionRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/setConsumption/{id}/{consumption}", produces = "application/json")
    public ResponseEntity<String> setConsumption(@PathVariable("id") Integer id, @PathVariable("consumption") Float consumptionNum) {

        System.out.println("Received " + id + ", Consumption: " + consumptionNum);

//        Consumption consumption = new Consumption();
//        consumption.setDeviceId(id);
//        consumption.setConsumption(consumptionNum);
//        consumptionRepository.save(consumption);

        return new ResponseEntity<String>("Consumption stored successfully!", HttpStatus.OK);
    }

}
