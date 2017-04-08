package com.test.core.service;

import com.test.core.pojo.QueryVo;
import com.test.core.pojo.User;

public interface IUserService {

	User login(User user);

	QueryVo list();

}
