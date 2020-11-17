package com.sh2004.crm.settings.service;

import com.sh2004.crm.settings.bean.User;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.sh2004.crm.settings.service
 * @Description: java类作用描述
 * @Author: 方杰
 * @CreateDate: 2020/11/17 17:16
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public interface UserService {

    List<User> queryUsers();
}
