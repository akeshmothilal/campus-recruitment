<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.campus.mapper.*,java.util.*,com.campus.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<div class="container-fluid">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active" href="/campus">Home</a>
					</li>
				
					<li class="nav-item"><a class="nav-link active"
						href="/studentlogout">logout</a></li>

				</ul>
			</div>
		</nav>
		<h2>${message}</h2>
		<br>

		<h3>Hello ${loggedStudent.userName}!</h3>
		<center>
			<%Student student = (Student) request.getAttribute("loggedStudent"); %>

			<h1>Vacances</h1>
			<%List<Vacancy> vacancyList =(List<Vacancy> ) request.getAttribute("vacancyList");
for(Vacancy v : vacancyList){
	%>

			<ul class="list-group">
				<li class="list-group-item active"><%=v.getCompanyName() %> is
					hiring college students</li>
				<li class="list-group-item">Role : <%=v.getJobTitle() %></li>
				<li class="list-group-item">Description : <%=v.getJobDescription() %></li>
				<li class="list-group-item">InterviewDate : <%=v.getInterviewDate()%></li>
				<li class="list-group-item">Venue : <%=v.getCollegeLocation() %></li>
				<li class="list-group-item"><a
					href="/apply?status=true&studentId=<%=student.getId()%>&jobId=<%=v.getJobId()%>"><button
							class="btn btn-success">Apply</button></a></li>

			</ul>

			<%} %>
		</center>
</body>
</html>