package cn.wzl.sbstudy.service.redis;

import cn.wzl.sbstudy.model.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by 99410 on 2018/10/30.
 */
@Repository
public class UserRedis{
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void add(String key,Long time,User user){
        redisTemplate.opsForValue().set(key, JSONObject.toJSONString(user),time, TimeUnit.MINUTES);
    }

    public User get(String key){
        User user = null;
        String userJson = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(userJson)){
            user = JSONObject.parseObject(userJson,User.class);

        }
        return user;
    }

    public List<User> getList(String key){
        List<User> ts = null;
        String listJson = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(listJson)){
            ts = JSONObject.parseArray(listJson,User.class);
        }
        return ts;
    }

    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }

}
