package com.hrmagic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping(value="/init", produces ="application/json")
	public String init(){
		
		System.out.println("BaseController.init()");
		return "<h1>Welcome to HR Magic App";
	}

}
