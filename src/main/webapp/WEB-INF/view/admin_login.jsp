<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
p{

color: red;
}



</style>
</head>
<body>
<div class="container">

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="">companylogin</a>
      </li>
   
    </ul>
  </div>
</nav>

</div>


<div>
<center>
<form action="/adminlogin" method="post" onsubmit="return validateUser();">


    <div class="form-group ">
     
<div class="form-outline w-25">
          <label for="userName"><strong>Admin Name</strong></label>
          <input type="text" name="adminName" id="adminName" class="form-control"><br>
        </div>
      <div class="form-outline w-25">
        <label for="ex2"><strong>Admin Password</strong></label>
        <input type="number" name = "adminPassword" id="adminPassword" width=20% class="form-control"  >
      </div>
      <br><br>
      
     
       <div class="form-outline w-25">
       <input type="submit" value="Login"  class="btn btn-primary"  >
        <input type="reset" value="caancel"  class="btn btn-danger"  >
       </div><br>
    </div>
    
  </form><br>
  

 <a href="/showcompanyregister"><h2>register here</h2></a>
   <p>${error} </p>
</center>
</div>
</body>
</html>