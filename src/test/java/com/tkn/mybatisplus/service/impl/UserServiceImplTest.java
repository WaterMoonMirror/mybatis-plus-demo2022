package com.tkn.mybatisplus.service.impl;

import com.tkn.mybatisplus.service.UserService;
import com.tkn.mybatisplus.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void test1(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }


}
