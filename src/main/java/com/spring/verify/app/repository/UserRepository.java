package com.spring.verify.app.repository;

import com.spring.verify.app.infrastructure.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepository {
  private final UserDao userDao;
}
