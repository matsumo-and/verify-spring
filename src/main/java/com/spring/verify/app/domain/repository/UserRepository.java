package com.spring.verify.app.domain.repository;

import com.spring.verify.app.domain.model.User;
import com.spring.verify.app.infrastructure.dao.UserDao;
import com.spring.verify.app.infrastructure.entity.PersonalInformationEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepository {
  private final UserDao userDao;

  public List<User> findUsers() {
    List<PersonalInformationEntity> entityList = this.userDao.findUsers();

    List<User> userList =
        entityList.stream()
            .map(
                personalInformationEntity ->
                    new User(
                        personalInformationEntity.id(),
                        personalInformationEntity.name(),
                        personalInformationEntity.email(),
                        personalInformationEntity.url()))
            .toList();

    return userList;
  }
}
