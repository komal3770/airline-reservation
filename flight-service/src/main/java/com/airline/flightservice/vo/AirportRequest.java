package com.airline.flightservice.vo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AirportRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String airportCode;
    @NotBlank
    private String city;
    @NotBlank
    private String country;
    private String correlationId;
}