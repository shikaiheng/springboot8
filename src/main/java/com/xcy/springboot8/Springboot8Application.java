package com.xcy.springboot8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller

public class Springboot8Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot8Application.class, args);
    }

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @RequestMapping("123")
    @ResponseBody
    public String aaa(){
        return "springboot1111111! name="+name+",age="+age;
    }

}
