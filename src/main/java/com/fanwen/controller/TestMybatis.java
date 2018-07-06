package com.fanwen.controller;

import com.alibaba.fastjson.JSON;
import com.fanwen.entity.User;
import com.fanwen.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    @Resource
    private UserService userService;

    @Test
    public void test() {
        User user = userService.selectByPrimaryKey(1);
        logger.info(JSON.toJSONString(user));
    }
}
