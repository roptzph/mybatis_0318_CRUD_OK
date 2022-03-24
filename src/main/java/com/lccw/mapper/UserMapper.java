package com.lccw.mapper;

import com.lccw.model.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * 编写接口com.lccw.mapper.UserMapper
 * 注意：需要使用@Mapper注解，不然SpringBoot无法扫描
 * 经过@当个笑话的评论后实践得知，如果启动类中使用了@MapperScan，可以不用使用@Mapper
 * @return
 */
//@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {
    /**
     * 功能：查询全部用户信息
     * @return
     */
    public List<UserLogin> queryAll(); //查全部
    public String add(UserLogin userLogin); //新增记录
    public UserLogin queryUserId(int id); //查一条记录
    public List<UserLogin> getName(String name); //模糊查姓名  有一条或多条，或空
    public int del(int id); //删除记录
    //public int update(String name, Integer age, String email,int id);
    public int update(UserLogin userLogin);



}
