package com.airline.flightservice.vo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Time;
import lombok.Data;

@Data
public class FlightRequest {
  @NotNull
  @Min(value = 100, message = "Capacity cannot be less than 100")
  private Integer capacity;

  @NotNull
  @Min(value = 10, message = "Number of passengers cannot be less than 10")
  private Integer noOfPassengers;

  @NotNull
  @Min(value = 1, message = "Id cannot be less than 0")
  private Long sourceAirportId;

  @NotNull
  @Min(value = 1, message = "Id cannot be less than 0")
  private Long destinationAirportId;

  @NotBlank private String flightCode;

  @NotBlank private String aircraft;

  @NotNull private BigDecimal price;

  @NotNull private Time startTime;

  @NotNull private Time endTime;
}
