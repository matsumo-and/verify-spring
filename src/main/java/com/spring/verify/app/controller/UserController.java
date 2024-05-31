package com.spring.verify.app.controller;

import com.spring.verify.app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {
  private final UserService userService;
}
