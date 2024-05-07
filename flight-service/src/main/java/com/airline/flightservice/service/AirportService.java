package com.airline.flightservice.service;

import com.airline.flightservice.entity.Airport;
import com.airline.flightservice.repository.AirportRepository;
import com.airline.flightservice.vo.AirportRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AirportService {
  @Autowired AirportRepository airportRepository;

  public Optional<Airport> findById(Long id) {
    return airportRepository.findById(id);
  }

  public List<Airport> findAll() {
    return airportRepository.findAll();
  }

  public void save(AirportRequest airportRequest) {
    log.info(
        "AIRPORT - {} - Save Airport Request {}",
        airportRequest.getCorrelationId(),
        airportRequest);
    airportRepository.save(toData(airportRequest));
  }

  public Airport toData(AirportRequest airportRequest) {
    log.info("AIRPORT - {} - To data", airportRequest.getCorrelationId());
    return Airport.builder()
        .name(airportRequest.getName())
        .airportCode(airportRequest.getAirportCode())
        .city(airportRequest.getCity())
        .country(airportRequest.getCountry())
        .build();
  }
}
