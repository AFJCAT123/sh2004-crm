package com.sh2004.crm.settings.controller;

import com.sh2004.crm.settings.bean.User;
import com.sh2004.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.sh2004.crm.settings.controller
 * @Description: java类作用描述
 * @Author: 方杰
 * @CreateDate: 2020/11/17 8:28
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(){
        return userService.queryUsers();
    }
}
