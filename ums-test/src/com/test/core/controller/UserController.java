package com.test.core.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.core.pojo.QueryVo;
import com.test.core.pojo.User;
import com.test.core.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/user/showlogin")
	public String showlogin(){
		return "login";
	}
	
	@RequestMapping("/user/login")
	public String login(User user,HttpSession session){
		User exitUser = userService.login(user);
		if(exitUser == null){
			return "login";
		}else{
			session.setAttribute("user", exitUser);
			return "index";
		}
	}
	
	@RequestMapping("/user/list")
	@ResponseBody
	public QueryVo list(){
		QueryVo queryVo = userService.list();
		return queryVo;
	}
	
}
