package com.jz.aqjz.Controller;

import com.jz.aqjz.entities.CommonResults;
import com.jz.aqjz.entities.User;
import com.jz.aqjz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public CommonResults login(@RequestBody User user) {

        if (null != userService.findUser(user.getUsername(), user.getPassword())) {
            return new CommonResults<User>(200, "登录成功！", user);
        } else {
            return new CommonResults(444, "登录失败！", null);
        }
    }

    @GetMapping("/get")
    public CommonResults findUserById(long id) {
        return new CommonResults<User>(200, "查询成功", userService.findUserById(id));
    }
}
