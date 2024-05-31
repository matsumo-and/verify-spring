package com.spring.verify.app.presentation.api.v1.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import java.io.File;

@Schema(title = "UserCreateRequest", description = "request to register user")
public record UserCreateRequest(
    @Schema(title = "name", example = "John Doe") @NotNull String name,
    @Schema(title = "email", example = "john_doe@email.com") @NotNull String email,
    @Schema(title = "file") @Nullable File file) {}
