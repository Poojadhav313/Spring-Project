package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.TodoModel;

public class MyService {
	static List<TodoModel> model = new ArrayList<>();
	
	static {
		
	}
	
	public void addModel()
	{
		model.add(new TodoModel("newmodeladded"));
	}

	public void displayModel() {
		for(TodoModel tm: model)
		{
			System.out.println(tm.getTask());
		}
		
	}
}
