
package com.wen.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wen.boot.model.User;

@Mapper
public interface IUserDao {
	public User getUserById(@Param(value="id")int id);
}
 