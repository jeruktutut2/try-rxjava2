package com.leju.tryrxjava2.service.impl;

import com.leju.tryrxjava2.entity.User;
import com.leju.tryrxjava2.repository.UserRepository;
import com.leju.tryrxjava2.service.UserService;
import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository ur;

    @Override
    public Flowable<User> findAll() {
        return Flowable.fromIterable(ur.findAll());
    }
}
