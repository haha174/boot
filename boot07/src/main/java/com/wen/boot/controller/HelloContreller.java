package com.wen.boot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@RestController
@RequestMapping("/hello")
public class HelloContreller {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/index")
	public String helloPage() {
		logger.info("index");
		return "";
	}
	
}
 