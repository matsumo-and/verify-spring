package com.spring.verify.app.presentation.api.v1.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

@Schema(title = "UserPostRequest", description = "request to upload user")
public record UserPostRequest(
    @Schema(title = "name", example = "John Doe") @NotNull String name,
    @Schema(title = "email", example = "john_doe@email.com") @NotNull String email) {}
