package com.web.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/web")
public class WebController {
	@RequestMapping(value = "/index")
	public String index(ModelMap map) {
		map.put("title", "jsp  ");
		return "index";
	}
}
