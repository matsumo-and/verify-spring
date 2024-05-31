package com.spring.verify.app.presentation.api.v1.controller;

import com.spring.verify.app.domain.anotation.MultiPartFile;
import com.spring.verify.app.domain.anotation.MultipartFileSize;
import com.spring.verify.app.domain.model.User;
import com.spring.verify.app.presentation.api.v1.request.UserCreateRequest;
import com.spring.verify.app.presentation.api.v1.response.UserResponse;
import com.spring.verify.app.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

  @PostMapping("/")
  @Operation(description = "register a user.")
  @ApiResponses({
    @ApiResponse(responseCode = "200", description = "OK"),
    @ApiResponse(responseCode = "400", description = "Invalid request body."),
    @ApiResponse(responseCode = "500", description = "unable to upload picture.")
  })
  public void registerUser(@Valid UserCreateRequest request) {}

  @PutMapping("/")
  @Operation(description = "upload a picture.")
  @ApiResponses({
    @ApiResponse(responseCode = "200", description = "OK"),
    @ApiResponse(responseCode = "400", description = "Invalid request body."),
    @ApiResponse(responseCode = "500", description = "unable to upload picture.")
  })
  public void uploadPicture(
      @Schema(title = "file", description = "file data")
          @Parameter(name = "file", description = "file data")
          @MultiPartFile
          @MultipartFileSize
          MultipartFile file,
      @Valid UserCreateRequest request) {}
}
