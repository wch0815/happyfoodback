package com.wdg.service;

import com.wdg.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUser();

    User login(User user);

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUserByUid(int uid);
}
