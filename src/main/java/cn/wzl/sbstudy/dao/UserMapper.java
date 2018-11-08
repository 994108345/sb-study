package cn.wzl.sbstudy.dao;


import cn.wzl.sbstudy.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 99410 on 2018/10/29.
 */
@Mapper
public interface UserMapper {

    User getOne();
}
