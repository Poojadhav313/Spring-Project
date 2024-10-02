package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.model.TodoModel;

public class MyService {
	static List<TodoModel> Todo = new ArrayList<>();
	
	static {
		
	}
	
	public void addModel(String task)
	{
		Todo.add(new TodoModel(task));
	}

	public Model displayModel(Model model) {
		List<TodoModel> tasks = TodoModel.getTask();
		model.addAttribute("tasks", tasks);
		return model;
	}
}
