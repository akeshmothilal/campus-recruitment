<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="com.campus.model.*, java.util.*"%>

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
           <li class="nav-item">
        <a class="nav-link active" href="/companylogout">logout</a>
      </li>
        </ul>
      </div>
    </nav>

    <div>
      <center>
        <% Company company = (Company) request.getAttribute("company"); %>

        <h1>Create Job here</h1>
        <h2><%= company.getCompanyName() %></h2>
        <form action="/createjob" method="post" onsubmit="return validateUser();">
          <div class="form-group">
            <div class="form-outline w-25">
              <label for="jobTitle"><strong>Job Title</strong></label>
              <input type="text" name="jobTitle" id="jobTitle" class="form-control"><br>
              <input type="hidden" name="companyID" id="companyID" value="<%= company.getId() %>" class="form-control"><br>
            </div>

            <div class="form-outline w-25">
              <label for="jobDescription"><strong>Job Description</strong></label>
              <input type="text" name="jobDescription" id="jobDescription" class="form-control"><br>
            </div>

            <div class="form-outline w-25">
              <label for="college_location"><strong>College Location</strong></label>
              <input type="text" name="collegeLocation" id="college_location" class="form-control"><br>
            </div>

            <div class="form-outline w-25">
              <label for="interviewDate"><strong>Interview Date</strong></label>
              <input type="date" name="interviewDate" id="interviewDate" class="form-control">
            </div>

            <div class="form-outline w-25">
              <label for="salary"><strong>Salary</strong></label>
              <input type="number" name="salary" id="salary" class="form-control"><br>
            </div><br>

            <div class="form-outline w-25">
              <input type="submit" value="Register" class="btn btn-primary">
              <input type="reset" value="Cancel" class="btn btn-danger">
              <p class="text-danger">${jobResult}</p>
            </div>
          </div>
        </form>
      </center>
    </div>
  </div>
</body>
</html>
