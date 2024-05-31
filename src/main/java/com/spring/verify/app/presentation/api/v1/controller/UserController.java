package com.spring.verify.app.presentation.api.v1.controller;

import com.spring.verify.app.domain.model.User;
import com.spring.verify.app.presentation.api.v1.response.UserResponse;
import com.spring.verify.app.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
  @Operation(description = "Get All Users.")
  @ApiResponse(responseCode = "200", description = "OK")
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
