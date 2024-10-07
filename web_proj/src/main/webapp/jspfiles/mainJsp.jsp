<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.model.TodoModel" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>

<link rel="stylesheet" href="../cssfiles/mainCss.css" type="text/css">

</head>
<body>
	<h1 id="heading">ToDo List</h1>
	
	<form action="/add" method="post">
		<input type="text" name="task" class="input-field" placeholder="Enter Task..." required autofocus>
		<button type="submit" id="submit-btn">Submit</button>
	</form>
	
	<br>
	
	<h2>Tasks:</h2>

	<ul id="list-ul">
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