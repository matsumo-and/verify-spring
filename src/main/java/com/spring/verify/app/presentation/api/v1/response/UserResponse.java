package com.spring.verify.app.presentation.api.v1.response;

import java.util.List;

public record UserResponse(List<User> userList) {

  public record User(long id, String name, String email) {}
}
