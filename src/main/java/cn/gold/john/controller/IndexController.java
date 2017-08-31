package cn.gold.john.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gold.john.dao.UserDao;
import cn.gold.john.dao.UserDaoImpl;
import cn.gold.john.entity.User;
import cn.gold.john.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index/go")
	@ResponseBody
	public String getIndex(){
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(10);
		user.setUsername("111");
		user.setPassword("9999");
		user.setRodecode("22");
		users.add(user);
		user = new User();
		user.setId(11);
		user.setUsername("2222");
		user.setPassword("8888");
		user.setRodecode("11");
		users.add(user);
		userService.saveUsers(users);
		return user.toString();
	}
	
	@RequestMapping("/findUser")
	@ResponseBody
	public List<User> findUser(){
		return userService.findAllUsers();
	}
}
