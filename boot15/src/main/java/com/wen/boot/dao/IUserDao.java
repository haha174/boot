
package com.wen.boot.dao;

import org.springframework.stereotype.Repository;

import com.wen.boot.model.User;


public interface IUserDao {
	public User getUserById(int id);
}
 