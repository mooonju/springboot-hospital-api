package com.likelion.controller;


import com.likelion.dao.UserDao;
import com.likelion.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/user")
    public void save(@RequestBody User user){
        userDao.add(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        userDao.deleteById(id);
    }

    @DeleteMapping("/user/all")
    public void deleteUserAll(){
        userDao.deleteAll();
    }

}
