package com.tkn.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tkn.mybatisplus.mapper.UserMapper;
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

    @Autowired
    UserMapper userMapper;

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

    @Test
    public void testPage(){
//设置分页参数
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
//获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }
    @Test
    public void testPage2(){
//设置分页参数
        Page<User> page = new Page<>(1, 5);
        userMapper.selectByAgePage(page, 20);
//获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }



}
