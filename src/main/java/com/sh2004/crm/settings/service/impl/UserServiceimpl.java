package com.sh2004.crm.settings.service.impl;

import com.sh2004.crm.settings.bean.User;
import com.sh2004.crm.settings.mapper.UserMapper;
import com.sh2004.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.sh2004.crm.settings.service.impl
 * @Description: java类作用描述
 * @Author: 方杰
 * @CreateDate: 2020/11/17 17:18
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service("/userService")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUsers() {
        return userMapper.selectAll();
    }
}
