package com.wen.boot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@RestController
@RequestMapping("/user")
public class HelloContreller {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping("/{id}")
	public String getUset(@PathVariable String id) {
		logger.info(id);
		return id;
	}
}
 