package com.fanwen.dao;

import com.fanwen.entity.User;

public interface UserDao {

    int deleteByPrimaryKey(int id);

    User selectByPrimaryKey(int id);

    int insertUser(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}
