package com.spring.verify.app.service;

import com.spring.verify.app.model.User;
import com.spring.verify.app.repository.UserRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<User> findUsers() {
    return this.userRepository.findUsers();
  }
}
