package com.wen.boot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/** 
* @author 作者 cxhc
* @version 创建时间：2017年9月21日 下午10:05:49 
*/

@Controller
@RequestMapping("/user")
public class HelloContreller {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping()
	 public String hello(Model model) {
        model.addAttribute("name", "cxhc");
        return "index";
    }
}
 