package cn.wzl.sbstudy.controller;

/**
 * Created by 99410 on 2018/10/29.
 */

import cn.wzl.sbstudy.model.User;
import cn.wzl.sbstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableTransactionManagement  // 需要事务的时候加上
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getOneUserName")
    public String getOneUserName(){
        return  "张三";
    }

    @GetMapping("getOne")
    public User getOne(){
        User user = userService.getOne();
        return user;
    }
}
