package com.tkn.mybatisplus.service.impl;

import com.tkn.mybatisplus.product.Product;
import com.tkn.mybatisplus.service.ProductService;
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
    @Autowired
    ProductService productService;

    @Test
    public void test1(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }
    @Test
    public void test2(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
        List<Product> products = productService.list();
        products.forEach(System.out::println);
    }


}
