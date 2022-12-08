package com.xxl.job.executor.service.synDataJobhandler.service.impl;

import com.xxl.job.executor.dao.TUserMapper;
import com.xxl.job.executor.entity.TUser;
import com.xxl.job.executor.service.synDataJobhandler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public TUser selectOneUser() {
        TUser user = tUserMapper.selectByPrimaryKey(496L);
        System.out.println("user = " + user);
        return user;
    }
}
