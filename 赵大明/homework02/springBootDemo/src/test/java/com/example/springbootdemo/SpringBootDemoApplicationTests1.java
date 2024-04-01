package com.example.springbootdemo;

import com.example.springbootdemo.bean.Users;
import com.example.springbootdemo.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemoApplicationTests1 {
    @Autowired
    UserMapper1 userMapper1;

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
    void test9(){
        userMapper1.deleteUser(2);
    }
}
