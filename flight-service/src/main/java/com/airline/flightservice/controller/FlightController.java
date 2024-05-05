package com.airline.flightservice.controller;

import com.airline.flightservice.service.FlightService;
import com.airline.flightservice.vo.FlightRequest;
import jakarta.validation.Valid;
import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @PostMapping
    public ResponseEntity<?> addFlight(@Valid FlightRequest flightRequest){
        flightService.save(flightRequest);
        return ResponseEntity.status(HttpStatus.SC_CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> getAllFlights(){
        System.out.println("Inside get all flight");
        return ResponseEntity.ok(flightService.findAll());
    }
}
