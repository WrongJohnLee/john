package cn.gold.john.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.gold.john.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	 @Autowired
	    private SessionFactory sessionFactory;

	@Override
	public int save(User u) {
		return (Integer) sessionFactory.getCurrentSession().save(u);
	}

	@Override
	public List<User> findAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		return criteria.list();
	}

}
