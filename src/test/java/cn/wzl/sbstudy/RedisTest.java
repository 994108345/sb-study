package cn.wzl.sbstudy;

import cn.wzl.sbstudy.model.User;
import cn.wzl.sbstudy.service.redis.UserRedis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 99410 on 2018/10/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    private Logger logger = LoggerFactory.getLogger(RedisTest.class);
    @Autowired
    private UserRedis userRedis;
    @Test
    public void addOneUser(){
        User user = new User();
        user.setUserName("wzl");
        user.setPassword("wzl");
        userRedis.add(User.class.getName() + ":userByname:" + user.getUserName(),10L,user);
    }
}
