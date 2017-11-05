
package com.wen.boot.dao.impl;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.wen.boot.dao.IUserDao;
import com.wen.boot.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	public User getUserById(int id) {
		String sql="select * from user where id=?";
		RowMapper<User> user=new BeanPropertyRowMapper<User>(User.class);
		return jdbcTemplate.queryForObject(sql,user,id);
	
	}
}
 