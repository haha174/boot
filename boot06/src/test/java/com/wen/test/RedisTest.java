package com.wen.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wen.boot.dto.RedisHandle;

public class RedisTest extends BaseTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	 RedisHandle rs;

	@Test
	public void RedisTest() throws Exception {
		 rs.set(1, "11");
	        System.out.println(rs.get(1));	
	}


}
