<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.model.TodoModel" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>
</head>
<body>
	<form action="/add" method="post">
		<input type ="text" name="task" required>
		<button type="submit">Submit</button>
	</form>
	
	
	
	<h2>Tasks:</h2>

	<ul>
        <%

            List<TodoModel> tasks = (List<TodoModel>) request.getAttribute("tasks");
            if (tasks != null) {
                for (TodoModel task : tasks) {
        %>
                    <li><%= task.getTask() %></li> 
        <%
                }
            } else {
        %>
                <li>No tasks available.</li>
        <%
            }
        %>
	</ul>
	
</body>
</html>