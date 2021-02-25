package com.jz.aqjz.service.impl;

import com.jz.aqjz.dao.UserDao;
import com.jz.aqjz.entities.User;
import com.jz.aqjz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(String username, String password) {
        return userDao.findUser(username, password);
    }

    @Override
    public User findUserById(long id) {
        return userDao.findUserById(id);
    }
}
