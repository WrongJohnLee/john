package cn.gold.john.dao;

import java.util.List;

import cn.gold.john.entity.User;

public interface UserDao {
	public int save(User u);
	public List<User> findAll();
}
