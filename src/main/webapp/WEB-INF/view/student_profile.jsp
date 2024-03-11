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


<h1>Hello ${loggedStudent.userName} you are applied these jobs! </h1>
<center>
<%List <ApplyJobs> appliedJobs = (List<ApplyJobs>) request.getAttribute("appliedJobs");

for(ApplyJobs a : appliedJobs){
	


%>

<ul class="list-group">
				<h3><li class="list-group-item active">Job Role :<%=a.getJobTitle() %> 
				</li></h3>
				<li class="list-group-item"><b>from</b>  <%=a.getCompanyName() %></li>
				<li class="list-group-item"><b>College Location</b>: <%=a.getCollegeLocation() %></li>
				<li class="list-group-item"><a href="/cancelapply?applyId=<%=a.getApplyId()%>"><button class="btn btn-danger">Cancel</button></a></li>
				
			</ul>

			<%} %>

 </center>
</body>
</html>