package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.TodoModel;

public class MyService {
	static List<TodoModel> model = new ArrayList<>();
	
	static {
		
	}
	
	public void addModel(String task)
	{
		model.add(new TodoModel(task));
	}

	public void displayModel() {
		for(TodoModel tm: model)
		{
			System.out.println(tm.getTask());
		}
		
	}
}
