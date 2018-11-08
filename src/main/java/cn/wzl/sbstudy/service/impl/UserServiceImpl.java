package cn.wzl.sbstudy.service.impl;

import cn.wzl.sbstudy.dao.UserMapper;
import cn.wzl.sbstudy.model.User;
import cn.wzl.sbstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 99410 on 2018/10/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getOne() {
        User user = userMapper.getOne();
        return user;
    }
}
