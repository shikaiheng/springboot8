package com.xcy.springboot8;

import com.xcy.springboot8.Mapper.UserMapper;
import com.xcy.springboot8.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot8Application.class)
public class Springboot8ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {

        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

}
