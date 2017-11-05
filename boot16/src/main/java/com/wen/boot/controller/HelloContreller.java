package com.wen.boot.controller;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wen.boot.dao.service.IUserService;
import com.wen.boot.model.User;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@RestController
@RequestMapping("/user")
public class HelloContreller {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	public IUserService userService;
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		
		return userService.getUserById(id);
	}
}
 