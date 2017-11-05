package com.wen.security.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
public class UserTest extends BaseTest{
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	@Test
	public void getUserInfo()  {
		try{

			String result=mockMvc.perform(MockMvcRequestBuilders.get("/user/1")
						.contentType(MediaType.APPLICATION_JSON_UTF8))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("$").value(1))
					.andReturn().getResponse().getContentAsString();
			System.out.println(result);	
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 用户创建请求
	 */	 
}
