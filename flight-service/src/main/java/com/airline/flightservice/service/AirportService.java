package com.airline.flightservice.service;

import com.airline.flightservice.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {
    @Autowired
    AirportRepository airportRepository;
}
