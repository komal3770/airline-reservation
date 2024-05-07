package com.airline.userservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.airline.userservice.services.UserService;
import com.airline.userservice.vo.UserRequest;
import jakarta.validation.Valid;
import org.slf4j.MDC;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ResponseEntity<?> getAllUsers() {
    System.out.println("Fetching all users..");
    var users = userService.findAll();
    if (users != null) {
      return ResponseEntity.ok(users);
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<?> addUser(@Valid @RequestBody UserRequest userRequest) {
    userService.addUser(userRequest);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
