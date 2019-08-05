package com.xcy.springboot8.Mapper;

import com.xcy.springboot8.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
