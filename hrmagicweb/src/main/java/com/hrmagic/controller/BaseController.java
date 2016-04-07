package com.hrmagic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@RequestMapping(value="/init")
	public String init(){
		
		System.out.println("BaseController.init()");
		return "<h1>Welcome to HR Magic App";
	}

}
