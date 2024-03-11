<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import= "com.campus.model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/companylogin">Home</a>
      </li>
    <%Company company = (Company) request.getAttribute("loggedComapny"); %>
       <li class="nav-item">
        <a class="nav-link active" href="/companyprofile?companyID=<%=company.getId()%>">CompanyProfile</a>
      </li>
        <li class="nav-item">
        <a class="nav-link active" href="/companylogout">logout</a>
      </li>
     
    </ul>
  </div>
</nav>
<h2>${result}</h2><br>
<h2>Hello! ${loggedComapny.companyName}</h2>

<center><a href= "/showcreatejob"><button class="btn btn-primary">Create Job</button></a></center>


<h1>Are your organization looking for talented students from on campus  </h1>
<%List<Student> studentList = (List<Student> ) request.getAttribute("studentList"); 
		
		for(Student s : studentList)
		
		{
		
		%>
<ul class="list-group">
				<li class="list-group-item active">Name : <%=s.getUserName() %> 
				</li>
				<li class="list-group-item">pecentage : <%=s.getPercentage() %> </li>
				<li class="list-group-item">colege    :<%=s.getCollege() %></li>
					<li class="list-group-item">Role  :<%=s.getRole() %></li>
				
			</ul>

<%} %>
</body> 
</html>