package com.spring.smarttrashmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//https://spring.io/guides/gs/accessing-data-mysql/

/**
 * Project main class
 *
 * execute: java -jar smarttrashmanagementsystem.jar
 */

@SpringBootApplication
@ComponentScan({"com.spring.smarttrashmanagementsystem"}) // this is the root package of everything
@EntityScan("com.spring.smarttrashmanagementsystem")
public class SmartTrashManagementSystem {

    public static void main(String[] args) {
        SpringApplication.run(SmartTrashManagementSystem.class, args);
    }

}
