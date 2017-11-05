 
package com.wen.boot.dao.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wen.boot.model.User;

public interface IUserService {
	public User getUserById(int id);
}
 