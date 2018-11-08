package cn.wzl.sbstudy.service.mongodb;

import cn.wzl.sbstudy.model.MongoDbUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by 99410 on 2018/11/8.
 */
public interface MongoDbUserRepository extends MongoRepository<MongoDbUser,String> {

    MongoDbUser findByFirstName(String name);
    List<MongoDbUser> findByLastName(String lastName);
}
