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
  <div class="bg-image" style="background-image: url('images/bg.png.png.jpg');">
    <!-- Your content goes here -->
</div>
  
    <form action="/studentregister" method="post" onsubmit="return validateUser();">
      <div class="form-group">
        <div class="form-outline w-25">
          <label for="userName"><strong>User Name</strong></label>
          <input type="text" name="userName" id="userName" class="form-control"><br>
        </div>
       <label><strong>Gender</strong></label>
  <div class="form-check">
    <label class="form-check-label" for="genderMale">
      <input type="radio" name="gender" id="genderMale" class="form-check-input" value="male">Male
    </label>
  </div>
  <div class="form-check">
    <label class="form-check-label" for="genderFemale">
      <input type="radio" name="gender" id="genderFemale" class="form-check-input" value="female">Female
    </label>
  </div>
        <div class="form-outline w-25">
          <label for="dateBirth"><strong>Date OF Birth</strong></label>
          <input type="date" name="dateOfBirth" id="datOfBirth" class="form-control">
        </div>
        <div class="form-outline w-25">
          <label for="college"><strong>College</strong></label>
          <input type="text" name="college" id="college" class="form-control"><br>
        </div>
        <div class="form-outline w-25">
          <label for="course"><strong>Course</strong></label>
          <select name="course">
            <option value="M.sc">M.sc</option>
            <option value="MCA">MCA</option>
            <option value="B.sc">B.sc</option>
            <option value="BCA">BCA</option>
            <option value="B.E">B.E</option>
          </select>
        </div>
        <div class="form-outline w-25">
          <label for="percentage"><strong>College Percntage</strong></label>
          <input type="number" name="percentage" id="percentage" class="form-control"><br>
        </div>
        
         <div class="form-outline w-25">
          <label for="customerPassword"><strong> Role</strong></label>
          <input type="text" name="role" id="role" class="form-control"><br>
        </div>
        
        <div class="form-outline w-25">
          <label for="customerPassword"><strong> Password</strong></label>
          <input type="text" name="userPassword" id="userPassword" class="form-control"><br>
        </div>
        
                <div class="form-outline w-25">
          <label for="customerPassword"><strong> Email ID</strong></label>
          <input type="text" name="email" id="email" class="form-control"><br>
        </div>
        
                <div class="form-outline w-25">
          <label for="customerPassword"><strong> Contact No</strong></label>
          <input type="number" name="contactNo" id="contactNo" class="form-control"><br>
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
