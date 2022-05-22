package com.tkn.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tkn.mybatisplus.user.User;
import com.tkn.mybatisplus.service.UserService;
import com.tkn.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 李柱
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-05-22 14:40:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




