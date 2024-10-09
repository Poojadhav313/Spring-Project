package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.service.MyService;


@Controller
public class MyController {
	
	//@Autowired
	MyService service = new MyService();
	
	@GetMapping("")
	public String call(Model model)
	{
		model.addAttribute("tasks", service.getModel());
		return "mainJsp";
	}
	
	
	@PostMapping("/add")
	public String adding(@RequestParam String task, Model model)
	{
		service.addModel(task);
		return "redirect:/";
	}

	
	/*
	 * @GetMapping("") 
	 * public String displaying(Model model) {
	 * model.addAttribute("tasks", service.getModel()); 
	 * return "mainJsp"; }
	 */
	
}
