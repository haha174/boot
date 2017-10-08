package com.wen.boot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wen.boot.config.ConfigString;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@RestController
@RequestMapping("/hello")
public class HelloContreller {
	@Autowired
	ConfigString ConfigString;

	@RequestMapping("/index.do")
	public String helloPage() {
		ConfigString.setHello("haha");
		System.out.println(ConfigString.getHello()+ConfigString.getWorld());
		return ConfigString.getHello()+ConfigString.getWorld();
	}
	
}
 