package com.spring.verify.app.infrastructure.dao;

import com.spring.verify.app.infrastructure.entity.UserEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

  public List<UserEntity> findUsers() {

    List<UserEntity> entityList =
        List.of(
            new UserEntity(1, "John Doe", "john_doe@google.com", "https://cat.com/"),
            new UserEntity(2, "Michael Era", "eraaaa@icloud.com", "https://dog.com/"));

    return entityList;
  }
}
