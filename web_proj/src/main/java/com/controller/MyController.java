package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	
	@RequestMapping("/show1")
	public String call()
	{
		return "mainJsp";
	}

}
