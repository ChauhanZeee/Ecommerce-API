package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.UserModel;
import com.geekster.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userModel")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/all-user")
    public List<UserModel> allUser(){
       return userService.getAllUser();
    }

    @GetMapping("/getUser-by/id/{id}")
    public UserModel model(@PathVariable Integer id){
        return userService.userByUserId(id);
    }
    @PostMapping("/create-user")
    public void createUser(@RequestBody UserModel userModel){
        userService.createUser(userModel);
    }
}
