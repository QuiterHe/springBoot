package com.he.springBoot.controller;

import com.he.springBoot.entity.UserEntity;
import com.he.springBoot.repository.UserRepository;
import com.he.springBoot.util.TestPropertiesYml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloWorldController {
    @Autowired
    private TestPropertiesYml config;

    @Autowired
    private UserRepository userRepository;

    private final Logger logger;

    public HelloWorldController() {
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @RequestMapping("/hello")
    public UserEntity index() {
//        HashMap map = new HashMap<String, String >();
//        map.put("name", "hezhang");
//        map.put("age", "18");
        logger.info("测试输出");
        return userRepository.findById(1);
//        return id;
//        return "ok" + config.getTitle();
    }
}
