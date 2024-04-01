package org.example.homework02;

import org.example.homework02.bean.Users;
import org.example.homework02.mapper.UserMapper;
import org.example.homework02.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;



@SpringBootTest
class Homework02ApplicationTests {
    @Autowired
    UserMapper userMapper1;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test1(){
        Users user = userMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("SiChuan");
        userMapper.addUser(users);
    }
    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setUsername("youlinwei");
        userMapper.updateUser(users);
    }
    @Test
    void test4(){
        userMapper.deleteUser(4);
    }
    @Test
    void test5(){
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        Users user = userMapper1.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("Spring!");
        userMapper1.addUser(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setUsername("Spring");
        userMapper1.updateUser(users);
    }
    @Test
    void test9() {
        userMapper1.deleteUser(2);
    }
}
