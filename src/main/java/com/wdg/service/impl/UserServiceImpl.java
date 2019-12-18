package com.wdg.service.impl;

import com.wdg.dao.IUserDao;
import com.wdg.pojo.User;
import com.wdg.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user) > 0;
    }

    @Override
    public boolean deleteUserByUid(int uid) {
        return userDao.deleteUserByUid(uid) > 0;
    }
}
