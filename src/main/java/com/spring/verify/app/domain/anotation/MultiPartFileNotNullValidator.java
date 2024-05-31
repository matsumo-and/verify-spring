package com.spring.verify.app.domain.anotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class MultiPartFileNotNullValidator
    implements ConstraintValidator<MultiPartFileNotNull, MultipartFile> {

  @Override
  public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext context) {
    try {
      return multipartFile.getBytes().length > 0;
    } catch (IOException e) {
      return false;
    }
  }
}
