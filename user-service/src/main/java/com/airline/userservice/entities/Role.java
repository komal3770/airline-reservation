package com.airline.userservice.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Role extends CommonProps {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long roleId;

  private String name;
}
