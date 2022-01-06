package com.szakdoga.zsemle.controller;

import com.szakdoga.zsemle.model.User;
import com.szakdoga.zsemle.persistence.entity.UserEntity;
import com.szakdoga.zsemle.service.UserService;
import com.szakdoga.zsemle.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public UserEntity createUser(@RequestBody UserView userview){
        return userService.createUser(userview);


    }

    @GetMapping("/find/{id}")
    public User findUser(@PathVariable Integer id){

        UserEntity entity = userService.findUser(id);
        User user = new  User();
        user.setId(entity.getId());
        user.setEmail(entity.getEmail());
        user.setName(entity.getName());
        return user;
    }

}
