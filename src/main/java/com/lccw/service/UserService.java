package com.lccw.service;

import com.lccw.model.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface UserService {
    /**
     * 功能：查询全部食物信息
     * @return
     */
    public List<UserLogin> queryAll();
    public String add(UserLogin  userLogin); //新增记录
    public UserLogin queryUserId(int id);
    public List<UserLogin> getName(String name); //查一个姓名行，多个出错
    public int del(int id); //删除记录
    //public int update(String name,Integer age,String email,int id); //删除记录
    public int update(UserLogin userLogin); //删除记录
}
