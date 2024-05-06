package com.airline.userservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.airline.userservice.services.UserService;
import com.airline.userservice.vo.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getAllUsers() {
    System.out.println("Fetching all users..");
    var users = userService.findAll();
    if (users != null) {
      return ResponseEntity.ok(users);
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<?> addUser(@Valid UserRequest userRequest) {
    userService.addUser(userRequest);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
