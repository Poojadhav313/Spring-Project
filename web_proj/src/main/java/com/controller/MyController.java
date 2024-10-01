package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import com.service.MyService;

@Controller
public class MyController {
	
	//@Autowired
	MyService service = new MyService();
	
	@RequestMapping("")
	public String call()
	{
		return "mainJsp";
	}
	
	
	@PostMapping("/add")
	public String adding(@RequestParam String task)
	{
		service.addModel(task);
		return "redirect:/";
	}
	
	@GetMapping("/display")
	public String displaying()
	{
		service.displayModel();
		return "displayJsp";
	}
}
