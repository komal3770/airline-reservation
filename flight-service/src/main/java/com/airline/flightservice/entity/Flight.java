package com.airline.flightservice.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class Flight extends Auditable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer capacity;
  private Integer noOfPassengers;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "source_airport_id", referencedColumnName = "id")
  private Airport source;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "destination_airport_id", referencedColumnName = "id")
  private Airport destination;

  private String flightCode;
  private String aircraft;
  private BigDecimal price;
  private Time startTime;
  private Time endTime;
}
