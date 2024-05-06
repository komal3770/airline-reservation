package com.airline.userservice.vo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {
  @NotBlank private String firstName;
  @NotBlank private String lastName;
  @NotNull private Integer age;
}
