package com.jz.aqjz.test;

import com.jz.aqjz.dao.UserDao;
import com.jz.aqjz.entities.User;
import com.jz.aqjz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {

    @Resource
    private UserDao userDao;

    @Resource
    private UserService userService;

    @Test
    public void testDao() {
        User user = userDao.findUser("aq20210224", "aq20210224");
        System.out.println(user);
       /* System.out.println(userDao.findAll());*/
    }

    @Test
    public void testService() {
        User user = userService.findUser("aq20210224", "aq20210224");
        System.out.println(user);
    }
}
