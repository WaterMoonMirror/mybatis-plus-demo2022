package com.tkn.mybatisplus.mapper;
import org.apache.ibatis.annotations.Param;

import com.tkn.mybatisplus.user.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 李柱
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-05-22 14:40:14
* @Entity com.tkn.mybatisplus.user.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByAgeAndEmail(@Param("age") Integer age, @Param("email") String email);

    int deleteByEmailA(@Param("email") String email);

    User selectOneByName(@Param("name") String name);
}




