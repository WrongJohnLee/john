package cn.gold.john.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gold.john.dao.UserDao;
import cn.gold.john.entity.User;


public interface UserService {

	public void saveUsers(List<User> users);
	public List<User> findAllUsers();
}
