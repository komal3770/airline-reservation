package com.airline.flightservice.service;

import com.airline.flightservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public void save(){

    }
}
