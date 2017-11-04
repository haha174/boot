/**
 * 
 */ 
package com.wen.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者 cxhc
* @version 创建时间：2017年10月28日 下午2:27:05 
*/
@Controller
@RequestMapping("/page")
public class PageController {
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
}
 