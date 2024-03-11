<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
    </ul>
  </div>
</nav>

<div>
  <center>
 
  
    <form action="/companyregister" method="post" onsubmit="return validateUser();">
      <div class="form-group">
        <div class="form-outline w-25">
          <label for="userName"><strong>Company Name</strong></label>
          <input type="text" name="companyName" id="companyName" class="form-control"><br>
        </div>
       <label><strong>Company Type</strong></label>
  <div class="form-check">
    <label class="form-check-label" for="genderMale">
      <input type="radio" name="companyType" id="genderMale" class="form-check-input" value="service">service
    </label>
  </div>
  <div class="form-check">
    <label class="form-check-label" for="genderFemale">
      <input type="radio" name="companyType" id="genderFemale" class="form-check-input" value="product">product
    </label>
  </div>
       
        <div class="form-outline w-25">
          <label for="college"><strong>headquarters</strong></label>
          <input type="text" name="headquarters" id="headquarters" class="form-control"><br>
        </div>
      
        
        
        
        <div class="form-outline w-25">
          <label for="customerPassword"><strong> Password</strong></label>
          <input type="text" name="companyPassword" id="companyPassword" class="form-control"><br>
        </div>
        
                <div class="form-outline w-25">
          <label for="customerPassword"><strong> Email ID</strong></label>
          <input type="text" name="email" id="email" class="form-control"><br>
        </div>
        
             
        
        <div class="form-outline w-25">
          <input type="submit" value="Register" class="btn btn-primary">
          <input type="reset" value="Cancel" class="btn btn-danger">
          <p class="text-danger">${message}</p>
          
        </div>
      </div>
    </form>
  </center>
</div>

</body>
</html>
