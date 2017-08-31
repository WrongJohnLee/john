package cn.gold.john.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.gold.john.dao.UserDao;
import cn.gold.john.entity.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public void saveUsers(List<User> users) {
		for(User user:users){
			userDao.save(user);
		}
		
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAll();
	}
	
	
}
