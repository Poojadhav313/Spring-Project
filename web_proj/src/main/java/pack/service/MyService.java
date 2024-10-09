package pack.service;

import java.util.ArrayList;
import java.util.List;

import pack.model.TodoModel;

import java.sql.*;

public class MyService {
	
	static Connection con;
	
	static {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
			
			if(con != null)
			{
				System.out.println("Connection established");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	static List<TodoModel> Todo = new ArrayList<>();
	
	public void addModel(String task)
	{
		Todo.add(new TodoModel(task));
	}

	public List<TodoModel> getModel() 
	{
		  return Todo;
	}
}
