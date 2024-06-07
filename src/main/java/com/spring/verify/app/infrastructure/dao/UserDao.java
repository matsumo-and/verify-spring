package com.spring.verify.app.infrastructure.dao;

import com.spring.verify.app.infrastructure.entity.PersonalInformationEntity;
import java.util.List;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface UserDao {

  @Select
  @Sql("""
          select * from personal_information
          """)
  List<PersonalInformationEntity> findUsers();
}
