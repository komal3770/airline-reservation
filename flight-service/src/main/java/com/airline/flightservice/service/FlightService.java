package com.airline.flightservice.service;

import com.airline.flightservice.entity.Airport;
import com.airline.flightservice.entity.Flight;
import com.airline.flightservice.repository.FlightRepository;
import com.airline.flightservice.vo.FlightRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightService {
  @Autowired FlightRepository flightRepository;

  @Autowired AirportService airportService;

  public void save(FlightRequest flightRequest) {
    Flight flight = toData(flightRequest);
    flightRepository.save(flight);
  }

  public List<Flight> findAll(){
    return flightRepository.findAll();
  }

  public Flight toData(FlightRequest flightRequest) {
    Airport source = null, destination = null;
    if (flightRequest.getSourceAirportId() != null) {
      source = airportService.findById(flightRequest.getSourceAirportId()).orElseThrow();
    }

    if (flightRequest.getDestinationAirportId() != null) {
      destination = airportService.findById(flightRequest.getDestinationAirportId()).orElseThrow();
    }

    return Flight.builder()
        .capacity(flightRequest.getCapacity())
        .noOfPassengers(flightRequest.getNoOfPassengers())
        .flightCode(flightRequest.getFlightCode())
        .price(flightRequest.getPrice())
        .aircraft(flightRequest.getAircraft())
        .source(source)
        .destination(destination)
        .startTime(flightRequest.getStartTime())
        .endTime(flightRequest.getEndTime())
        .build();
  }
}
