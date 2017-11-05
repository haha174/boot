
package com.wen.boot.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wen.boot.dao.IUserDao;
import com.wen.boot.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	@Resource
	private SessionFactory sessionFactory;
	public User getUserById(int id) {
		Session session=sessionFactory.openSession();
		User user=session.get(User.class, id);
		session.close();
		return user;
	}
}
 