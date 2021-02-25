package com.jz.aqjz.dao;

import com.jz.aqjz.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    public User findUser(@Param("username")String username, @Param("password")String password);

    public User findUserById(long id);

    public List<User> findAll();
}
