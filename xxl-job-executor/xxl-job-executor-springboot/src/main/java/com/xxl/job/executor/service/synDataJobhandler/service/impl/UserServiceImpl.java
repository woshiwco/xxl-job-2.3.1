package com.xxl.job.executor.service.synDataJobhandler.service.impl;

import com.xxl.job.executor.dao.UserMapper;
import com.xxl.job.executor.entity.User;
import com.xxl.job.executor.service.synDataJobhandler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectOneUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println("user = " + user);
        return user;
    }
}
