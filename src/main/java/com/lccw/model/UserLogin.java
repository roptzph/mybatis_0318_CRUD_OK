package com.lccw.model;

/**
 * 功能： 数据库h2中的user表的实体类
 * @param
 *        id   编号  主键
 *        name  姓名
 *        age   年龄
 *        email  邮箱
 */
//只有实体只写表名User,其余的写表名+层名  如：UserMapper

public class UserLogin {
    private int id;
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public UserLogin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
