package com.fanwen.dao.daoImpl;

import com.fanwen.dao.UserDao;
import com.fanwen.entity.User;


public class UserDaoImpl implements UserDao {
    User user = new User();


    public int deleteByPrimaryKey(int id) {
        return 0;
    }

    public User selectByPrimaryKey(int id) {
        return null;
    }

    public int insertUser(User user) {
        return 0;
    }

    public int insertSelective(User user) {
        return 0;
    }

    public int updateByPrimaryKeySelective(User user) {
        return 0;
    }

    public int updateByPrimaryKey(User user) {
        return 0;
    }
}
