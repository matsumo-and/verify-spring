package com.spring.verify.app.domain.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MultiPartFileNotNullValidator.class)
public @interface MultiPartFileNotNull {
  // error message
  public String message() default "Invalid color: must be RED, GREEN or BLUE";

  // represents group of constraints
  public Class<?>[] groups() default {};

  // represents additional information about annotation
  public Class<? extends Payload>[] payload() default {};
}
