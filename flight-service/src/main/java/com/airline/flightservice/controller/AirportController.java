package com.airline.flightservice.controller;

import com.airline.flightservice.entity.Airport;
import com.airline.flightservice.service.AirportService;
import com.airline.flightservice.vo.AirportRequest;
import com.airline.flightservice.vo.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/airports")
public class AirportController {

  @Autowired AirportService airportService;

  @PostMapping
  public ResponseEntity<?> addNewAirport(@Valid @RequestBody AirportRequest airportRequest) {
    airportRequest.setCorrelationId(UUID.randomUUID().toString());
    airportService.save(airportRequest);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(new ApiResponse(true, null, airportRequest.getCorrelationId()));
  }

  @GetMapping
  public ResponseEntity<List<Airport>> getAll() {
    return ResponseEntity.ok(airportService.findAll());
  }
}
