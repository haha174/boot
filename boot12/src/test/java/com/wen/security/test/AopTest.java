/**
 * 
 */ 
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

/** 
* @author 作者 文强
* @version 创建时间：2017年11月4日 上午9:47:50 
*/
/**
 * @author 文强
 *
 */
public class AopTest extends BaseTest{
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	//before  test
	@Test
	public void beforeTest()  {
		try{
			String result=mockMvc.perform(MockMvcRequestBuilders.get("/aop/before/key/value")
					.contentType(MediaType.APPLICATION_JSON_UTF8))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("$").value(1))
					.andReturn().getResponse().getContentAsString();
			System.out.println(result);	
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void throwTest()  {
		try{
			String result=mockMvc.perform(MockMvcRequestBuilders.get("/aop/throwing/key")
					.contentType(MediaType.APPLICATION_JSON_UTF8))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("$").value(1))
					.andReturn().getResponse().getContentAsString();
			System.out.println(result);	
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void aroundTest()  {
		try{
			String result=mockMvc.perform(MockMvcRequestBuilders.get("/aop/around/key")
					.contentType(MediaType.APPLICATION_JSON_UTF8))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("$").value(1))
					.andReturn().getResponse().getContentAsString();
			System.out.println(result);	
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
}
 