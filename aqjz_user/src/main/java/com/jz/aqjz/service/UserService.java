package com.jz.aqjz.service;

import com.jz.aqjz.entities.User;

public interface UserService {

    public User findUser(String username, String password);

    public User findUserById(long id);
}
