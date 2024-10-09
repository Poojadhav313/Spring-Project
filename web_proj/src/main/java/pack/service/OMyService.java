package pack.service;

import java.util.ArrayList;
import java.util.List;

import pack.model.TodoModel;

public class OMyService {
	static List<TodoModel> Todo = new ArrayList<>();
	
	static {}
	
	public void addModel(String task)
	{
		Todo.add(new TodoModel(task));
	}

	public List<TodoModel> getModel() 
	{
		return Todo;
	}
}
