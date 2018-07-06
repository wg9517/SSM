package com.fanwen.service.serviceImpl;

import com.fanwen.dao.UserDao;
import com.fanwen.entity.User;
import com.fanwen.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public int deleteByPrimaryKey(int id) {
        return userDao.deleteByPrimaryKey(id);
    }

    public User selectByPrimaryKey(int id) {
        return this.userDao.selectByPrimaryKey(id);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int insertSelective(User user) {
        return userDao.insertSelective(user);
    }

    public int updateByPrimaryKeySelective(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    public int updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}
