package com.atb.mumushop.user.service.impl;

import com.atb.mumushop.user.mapper.UserMapper;
import com.atb.mumushop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by atb1998 on 2020/11/10.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

}
