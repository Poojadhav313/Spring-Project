package com.model;

import java.util.ArrayList;
import java.util.List;

public class TodoModel {
	private String task;
	
	public TodoModel(){}
	
	public TodoModel(String task)
	{
		super();
		this.task = task;
	}
	
	public void setTask(String task)
	{
		this.task = task;
	}
	
	 public String getTask() 
	 {
	        return task;
	 }
	
	public List<TodoModel> getTasks()
	{
		List<TodoModel> tasks = new ArrayList<>();
        // Add some dummy tasks for demonstration
        tasks.add(new TodoModel("Task 1"));
        tasks.add(new TodoModel("Task 2"));
		
		return tasks;
	}
	
}
