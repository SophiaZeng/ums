package com.test.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.core.dao.UserDao;
import com.test.core.pojo.QueryVo;
import com.test.core.pojo.User;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User login(User user) {
		return userDao.getUserByUsernameAndPassword(user);
	}
	@Override
	public QueryVo list() {
		QueryVo queryVo = new QueryVo();
		List<User> list = userDao.getUserList();
		queryVo.setUsers(list);
		return queryVo;
	}

}
