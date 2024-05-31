package com.spring.verify.app.repository;

import com.spring.verify.app.infrastructure.dao.UserDao;
import com.spring.verify.app.infrastructure.entity.UserEntity;
import com.spring.verify.app.model.User;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepository {
  private final UserDao userDao;

  public List<User> findUsers() {
    List<UserEntity> entityList = this.userDao.findUsers();

    List<User> userList =
        entityList.stream()
            .map(
                userEntity ->
                    new User(
                        userEntity.id(), userEntity.name(), userEntity.email(), userEntity.url()))
            .toList();

    return userList;
  }
}
