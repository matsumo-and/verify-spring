package com.spring.verify.app.presentation.api.v1.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@Schema(title = "UserResponse", description = "UserResponse")
public record UserResponse(@Schema(title = "userList") List<User> userList) {

  @Schema(title = "User", description = "each user")
  public record User(
      @Schema(title = "id", example = "1") long id,
      @Schema(title = "name", example = "John Doe") String name,
      @Schema(title = "email", example = "john_doe@email.com") String email) {}
}
