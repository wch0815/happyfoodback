package com.wdg.dao;

import com.wdg.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<User> getAllUser();

    User login(User user);

    int saveUser(User user);

    int updateUser(User user);

    int deleteUserByUid(int uid);
}
