package com.lccw.controller;

import com.lccw.model.UserLogin;
import com.lccw.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * 功能：测试页面
 * @return
 */
//Controller类都需要加入注解@Controller，表示这是一个控制类
//如果Controller中一个函数需要返回json数据类型，则需要加入@ResponseBody注解，
// 通常用来返回JSON数据或者是XML，一般我们返回字符串类型时也需要使用这个注解
// 慎用@RestController，@RestController是@ResponseBody和@Controller的结合，
// 当你返回的类型不是json等的时候，使用这个会将你返回的数据自动转换成json类型返回。
// 比如你需要返回一个页面的时候就不能使用这个
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/query")
    public List<UserLogin> queryAll() {
        return userService.queryAll();
    }

    @RequestMapping("/add")
    public String add(UserLogin userLogin) {
       return  userService.add(userLogin) == null ?"成功插入":"新增失败"; //失败不会显示？


    }
    //  /queryuserid?id=1 方式
    /*  @RequestMapping("/queryuserid")
    public UserLogin queryUserId(int id) {
        return userService.queryUserId(id);
    } */
    //  /queryuserid/1  方式形参中加（@PathVariable int id) 才能取到地址路径
    @RequestMapping("/id/{id}")
    public UserLogin queryUserId(@PathVariable int id) {
        return userService.queryUserId(id);
    }
    @RequestMapping("/name/{name}")
    public List<UserLogin> getName(@PathVariable String name) {
        return userService.getName(name);
    }

    @RequestMapping("/del/{id}")
    public int del(@PathVariable int id) {
        return userService.del(id);
    }
    @RequestMapping("/update")
    public int update(    String name,
                          //sql中update用了动态语句null,所以要用基本数据类型，Integer初始值为null,而int为0
                          Integer age,
                          String email,
                          int id) {
        return userService.update(name,age,email,id);
    }

}


