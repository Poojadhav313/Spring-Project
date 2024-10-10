<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="pack.model.TodoModel" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>

<link rel="stylesheet" href="../cssfiles/mainCss.css" type="text/css">

</head>
<body>
	<h1 id="heading">To Do List</h1>
	
	<form action="/add" method="post">
		<input type="text" name="task" class="input-field" placeholder="Enter Task..." maxlength = "80" required autofocus>
		<button type="submit" id="submit-btn">Add</button>
	</form>
	
	<br>
	
<!-- 	<h2>Tasks:</h2>		-->

	<ul id="list-ul">
        <%

            List<String> tasks = (List<String>) request.getAttribute("tasks");
	        if (!tasks.isEmpty()) {
	            for (int i = tasks.size() - 1; i >= 0; i--) {
	                
        %>
                    <li><%= tasks.get(i) %></li> 
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