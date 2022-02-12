package com.example.demoplus.org.service.impl;

import com.example.demoplus.basic.service.impl.BaseServiceImpl;
import com.example.demoplus.org.entity.User;
import com.example.demoplus.org.mapper.UserMapper;
import com.example.demoplus.org.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务层实现类
 *
 * @author dclef
 * @since 2022-02-12 09:41:46
 */
@Service

public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource(name="userMapper")
    private UserMapper userMapper;
}

