package com.wen.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月24日 下午6:14:25 
*/
//这里标注       前缀
@Component
@ConfigurationProperties(prefix = "wen")
public class ConfigString {
	 private String hello;
	 private String world;
	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}
	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
	/**
	 * @return the world
	 */
	public String getWorld() {
		return world;
	}
	/**
	 * @param world the world to set
	 */
	public void setWorld(String world) {
		this.world = world;
	}
	 
}
 