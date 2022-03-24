package com.lccw.service.impl;

import com.lccw.mapper.UserMapper;
import com.lccw.model.UserLogin;
import com.lccw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLOutput;
import java.util.List;

/*
    * 编写实现类com.zhg.demo.mybatis.service.impl.UserServiceimpl
      注意：需要在接口实现类中使用@Service注解，才能被SpringBoot扫描，
    * 在Controller中使用@Authwired注入

* */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    //@Autowired   为什么人家用这个行，本处不行？
    private UserMapper userMapper;
    /**
     * 功能：查询全部食物信息
     */
    @Override
    public List<UserLogin> queryAll() {
        return userMapper.queryAll();
    }
    @Override
    public String add(UserLogin userLogin) {

            return userMapper.add(userLogin);
    }

    @Override
    public UserLogin queryUserId(int id){

        return userMapper.queryUserId(id);
    }
    @Override
    public List<UserLogin> getName(String name){

        return userMapper.getName(name);
    }

    @Override
    public int del(int id) {
        return userMapper.del(id);
    }

    @Override
    //public int update(String name, Integer age, String email,int id) {
  //      return userMapper.update(name,age,email,id);
   // }
    public int update(UserLogin userLogin) {
        return userMapper.update(userLogin);
    }
}
