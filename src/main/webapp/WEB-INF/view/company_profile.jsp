<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "com.campus.mapper.*,java.util.*,com.campus.model.*"%>
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
        <a class="nav-link active" href="/campus">Home</a>
      </li>
      
      
        <li class="nav-item">
        <a class="nav-link active" href="/studentlogout">logout</a>
      </li>
     
    </ul>
  </div>
</nav>


<h1>Hello ${loggedCompany.companyName} Your requirement and applied students!  </h1>
<center>
<%List<CompanyProfile> appliedStudent = (List<CompanyProfile> ) request.getAttribute("appliedStudent") ;

for(CompanyProfile jobTitle : appliedStudent)
{
	
	%>

	<ul class="list-group">
	<li class="list-group-item active"> <%=jobTitle.getJobTitle() %></li>

<%

for(CompanyProfile students : appliedStudent){
	




%>

	<li class="list-group-item"><%=students.getUserName() %></li>
			</ul>

<%}  %>

<%} %>

			
			

			

 </center>
</body>
</html>