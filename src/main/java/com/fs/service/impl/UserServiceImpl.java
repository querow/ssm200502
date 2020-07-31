package com.fs.service.impl;

import com.fs.mapper.UserMapper;
import com.fs.model.User;
import com.fs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author ss
 * @Date 2020/7/27 9:53
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;
    public User getUserById() {
        return um.selectByPrimaryKey(2);
    }
}
