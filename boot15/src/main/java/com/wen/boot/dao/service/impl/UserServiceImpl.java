 package com.wen.boot.dao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.boot.dao.IUserDao;
import com.wen.boot.dao.service.IUserService;
import com.wen.boot.model.User;

@Service
public class UserServiceImpl implements  IUserService{

	@Resource(name="userDao")
	private IUserDao userDao;	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
}
 