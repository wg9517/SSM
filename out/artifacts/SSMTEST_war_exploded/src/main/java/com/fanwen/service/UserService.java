package com.fanwen.service;

import com.fanwen.entity.User;

public interface UserService {

    int deleteByPrimaryKey(int id);

    User selectByPrimaryKey(int id);

    int insertUser(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}
