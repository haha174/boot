package com.wen.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wen.boot.config.ConfigString;

public class JunitTest extends BaseTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ConfigString ConfigString;
	@Test
	public void RedisTest() throws Exception {
		System.out.println(ConfigString.getHello());
	}
}
