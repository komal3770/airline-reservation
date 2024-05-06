package com.airline.userservice.services;

import com.airline.userservice.entities.User;
import com.airline.userservice.repositories.UserRepository;
import com.airline.userservice.vo.UserRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public void addUser(UserRequest userRequest) {
    User user = new User();
    user.setFirstName(userRequest.getFirstName());
    user.setLastName(userRequest.getLastName());
    user.setAge(userRequest.getAge());
    userRepository.save(user);
  }
}
