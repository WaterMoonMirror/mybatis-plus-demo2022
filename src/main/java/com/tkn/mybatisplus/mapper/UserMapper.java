package com.tkn.mybatisplus.mapper;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import com.tkn.mybatisplus.user.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author tkn
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-05-22 14:40:14
* @Entity com.tkn.mybatisplus.user.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByAgeAndEmail(@Param("age") Integer age, @Param("email") String email);

    int deleteByEmailA(@Param("email") String email);

    User selectOneByName(@Param("name") String name);

    /**
     * 根据年龄查询用户列表，分页显示
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位
     * @param age 年龄
     * @return
     */
    Page<User> selectByAgePage(@Param("page") Page<User> page,@Param("age") Integer age);
}




