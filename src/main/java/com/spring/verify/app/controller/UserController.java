package com.spring.verify.app.controller;

import com.spring.verify.app.controller.response.UserResponse;
import com.spring.verify.app.model.User;
import com.spring.verify.app.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
@Validated
public class UserController {
  private final UserService userService;

  @GetMapping("/")
  public UserResponse findUsers() {

    List<User> userList = this.userService.findUsers();

    UserResponse response =
        new UserResponse(
            userList.stream()
                .map(user -> new UserResponse.User(user.id(), user.email(), user.url()))
                .toList());
    return response;
  }
}
