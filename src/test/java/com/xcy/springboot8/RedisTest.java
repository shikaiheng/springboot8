package com.xcy.springboot8;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xcy.springboot8.Mapper.UserMapper;
import com.xcy.springboot8.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot8Application.class)
public class RedisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test() throws JsonProcessingException {

        String aaa = redisTemplate.boundValueOps("user.findAll").get();
        if(null==aaa){
            List<User> all = userMapper.queryUserList();
            ObjectMapper om = new ObjectMapper();
            aaa = om.writeValueAsString(all);
            redisTemplate.boundValueOps("user.findAll").set(aaa);
            System.out.println("==================从数据库获取数据");
        }else{
            System.out.println("========================= congredis中获取数据");
        }

        System.out.println(aaa);
    }


}
