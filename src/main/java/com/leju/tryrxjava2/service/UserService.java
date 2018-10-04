package com.leju.tryrxjava2.service;

import com.leju.tryrxjava2.entity.User;
import io.reactivex.Flowable;

public interface UserService {
    Flowable<User> findAll();
}
