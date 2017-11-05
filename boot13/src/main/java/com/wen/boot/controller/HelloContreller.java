package com.wen.boot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@Controller
@RequestMapping("/user")
public class HelloContreller {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping(value = "index")
	public String index(ModelMap map) {
		map.addAttribute("name", "cxhc");
		return "index"; 
	}
}
 