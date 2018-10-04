package com.leju.tryrxjava2.restcontroller;

import com.leju.tryrxjava2.entity.User;
import com.leju.tryrxjava2.service.UserService;
import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Flowable<User> all() {
        return us.findAll();
    }
}
