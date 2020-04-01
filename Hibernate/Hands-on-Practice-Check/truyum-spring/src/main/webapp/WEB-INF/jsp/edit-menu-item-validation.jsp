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
						  <a class="nav-link" href="menu-item-list.html">Menu Item</a>
						</li>
					  </ul>
					</div>

			</nav>
		</header>
		<div class="container">
		<h2>Edit Menu Item</h2>
		<form action="edit-success" onsubmit="return validate()" method="post">
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-10">
						<label>Item Name</label>
						<input type="text" class="form-control" id="itemname" maxlength=200>
						<div id="status1" style="color: red;"></div>
						<div id="status2" style="color: red;"></div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
					<div class="form-group">
					<label for="sel1">Price</label>
					<input type="number" class="form-control" id="price" value="">
					<div id="status3" style="color: red;"></div>	
					</div>
					</div>
					<div class="col-lg-3">
						<label>Date of Launch</label>
						<input type="text" class="form-control" id="dateoflaunch" placeholder="dd/mm/yyyy">
					</div>
					<div class="col-sm-3">
					<div class="form-group">
					<label for="sel1">Category</label>
					<select class="form-control" id="cusine">
						<option>Starter</option>
						<option>Dessert</option>
						<option>Main Course</option>
					</select>
					</div>
					</div>
					<div class="col-lg-3">
					<label>Active</label><br>
					<label class="radio-inline">
						<input type="radio" name="optradio">Yes
					</label>
					<label class="radio-inline">
						<input type="radio" name="optradio">No
					</label>
					</div>
					
				</div>
				<div class="row">
					<div class="col-lg-3">
					<label class="checkbox-inline">
						<input type="checkbox">
					</label>
						<label>Free Delivery</label><br>
					
				</div>
				</div>
				  <button type="submit" class="btn btn-primary">Save</button>
			</div>
		</form>
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
				
			function validate() 
			{
			  	var x = document.getElementById("itemname").value;
				var price = document.getElementById("price").value;
			
				  if (x == "") 
				  {
					document.getElementById("status1").innerHTML = "Item Name is required."; 
					return false;
				  }
					if(x.size >200)
					{
						document.getElementById("status2").innerHTML = "Item Name cannot exceed 200 characters"; 
						return false;
					}
				
				if(price=="")
					{
						document.getElementById("status3").innerHTML = "Price is required."; 
					return false;
					}
					
				
				
			}
		</script>	
    </body>
</html>
