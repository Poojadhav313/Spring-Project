package pack.model;

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
	
}
