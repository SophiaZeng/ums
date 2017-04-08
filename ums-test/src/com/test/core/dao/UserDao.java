package com.test.core.dao;

import java.util.List;

import com.test.core.pojo.User;

public interface UserDao {

	User getUserByUsernameAndPassword(User user);

	List<User> getUserList();

}
