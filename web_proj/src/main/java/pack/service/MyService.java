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
		
	
	public void addModel(String task)
	{
		try {
			String sql = "insert into todotable(taskname) values (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, task);
			
			int x = pst.executeUpdate();
			System.out.println("one row added");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}

	public List<String> getModel() 
	{
		List<String> newlist = new ArrayList<>();
		
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from todotable");
			
			while(rs.next())
			{
				newlist.add(rs.getString("taskname"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return newlist;
	}
}
