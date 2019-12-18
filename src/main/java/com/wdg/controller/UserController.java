package com.wdg.controller;

import com.wdg.pojo.User;
import com.wdg.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf_backstage")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/login")
    public User login(User user){
        return userService.login(user);
    }

    @PutMapping("/updateUser")
    public boolean updateUser(User user){
        return userService.updateUser(user);
    }

    @PostMapping("/saveUser")
    public boolean saveUser(User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/deleteUserByUid/{uid}")
    public boolean daleteUser(@PathVariable int uid){
        return userService.deleteUserByUid(uid);
    }
}
