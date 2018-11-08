package cn.wzl.sbstudy;

import cn.wzl.sbstudy.model.MongoDbUser;
import cn.wzl.sbstudy.service.mongodb.MongoDbUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by 99410 on 2018/11/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongDBTest {
    @Resource
    private MongoDbUserRepository mongoDbUserRepository;
    @Test
    public void addTest(){
        MongoDbUser mongoDbUser = new MongoDbUser();
        mongoDbUser.setFirstName("3");
        mongoDbUser.setLastName("3");
        mongoDbUserRepository.save(mongoDbUser);
    }
    @Test
    public void getTest(){
        MongoDbUser mongoDbUser =  mongoDbUserRepository.findByFirstName("3");
        System.out.println("输出内容为："+mongoDbUser.toString());
    }
}
