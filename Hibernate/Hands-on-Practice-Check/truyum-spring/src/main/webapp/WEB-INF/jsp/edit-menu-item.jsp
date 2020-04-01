<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>	  
  <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css"/>
  <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
  
        <title>truYum</title>
        <style>
			.navbar{
				background-color: orangered;
			}
			.footer{
				
			   	position: fixed;
				left: 0;
			   	bottom: 0;
			   	width: 100%;
			   	background-color: orangered;
			   	color: white;
				text-align: left;
			   	
			}
			
			.row{
				padding-left: 10px;
				padding-right: 10px;
			}
			
			
			
        </style>
    </head>
    <body>
		<header class="header">
			<nav class="navbar navbar-expand-md navbar-dark mb-3">

					<a class="navbar-brand" href="#">truYum</a>
					<button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
					  <span class="navbar-toggler-icon"></span>
					</button>
					<div class="navbar-collapse collapse" id="navbarCollapse" style="">
					  <ul class="navbar-nav ml-auto">
						<li class="nav-item active">
						
						  <a class="nav-link" href="menu-item-list-admin.html">Menu Item</a>
						</li>
					  </ul>
					</div>

			</nav>
		</header>
		<div class="container">
		
		<form:form action="edit-menu-item-success" method="post" modelAttribute="editMenuItem">
    <div class="title">Edit Menu Item Details</div>
    <div class="container-fluid">
        <div class="form-row">
          <div class="col-sm-3">
          	<form:label path="id" for="id">ID</form:label>
          	<form:input path="id" class="form-control" id="id" value="${Menuid} "/>
          	</div>
          <div class="col-sm-9">
          	
              <form:label path="name"  for="title">Name</form:label>
              <form:input path="name" type="text" class="form-control" id="title" required="required" />
          </div> 
        </div>
        
        <div class="form-row">
          <div class="col-sm-3">
              <form:label path="price" for="price">Price</form:label>
              <form:input path="price" type="text" class="form-control" id="price" required="required" />
          </div>
          <div class="col-sm-3">
              <form:label path="dateOfLaunch" for="dateOfLaunch">Date of Launch</form:label>
              <form:input path="dateOfLaunch" type="text" class="form-control" id="dateOfLaunch" required="required" />
          </div>
          <div class="col-sm-3">
            <form:label path="category"  for="genre">Category</form:label>
            <form:select path="category" id="genre" class="form-control" items="${categoryList}">

            </form:select>
          </div>
          <div class="col-sm-3">
            <form:label path="active" for="active">Active</form:label>
            <br>
            <div class="form-check-inline">
                <form:label path="active" class="form-check-label">
                 <form:radiobutton path="active" class="form-check-input" id="active" name="active" value="yes" />Yes
            </form:label></div>
            <div class="form-check-inline">
                <form:label path="active" class="form-check-label">
            <form:radiobutton path="active" class="form-check-input" id="active" name="active" value="no" />No
            </form:label></div>
              
          </div>
        </div>
       <div class="form-row">
        <div class="col-sm-3">
            <form:label path="freedelivery" for="active">Free Delivery</form:label>
            <br>
            <div class="form-check-inline">
                <form:label path="hasTeaser" class="form-check-label">
                 <form:radiobutton path="hasTeaser" class="form-check-input" id="active" name="active" value="yes" />Yes
            </form:label></div>
            <div class="form-check-inline">
                <form:label path="hasTeaser" class="form-check-label">
            <form:radiobutton  path="hasTeaser" class="form-check-input" id="active" name="active" value="no" />No
            </form:label></div>
              
          </div>
       </div>
        <div class="row">
          <div class="col-sm-3">
         <input name="submit" class="btn save" value="Save" type="submit" />
      </div></div>
      </div>
      
</form:form>  
</div>
			
		<footer class="footer">
			<div class="row">
				<div class="col-md-6">
					<p>Copyright &copy; 2019 </p>
				</div>
			</div>
		</footer>          
        
		<script>
			$('#dateoflaunch').datepicker({
			uiLibrary: 'bootstrap4',
			format: 'dd/mm/yyyy'
			});
			</script>
			<script>
			$("button").click(function(){
			  $("button").removeClass("active");
			  $(this).addClass("active");
			});
				
			
		</script>

		
    </body>
	
	

</html>
