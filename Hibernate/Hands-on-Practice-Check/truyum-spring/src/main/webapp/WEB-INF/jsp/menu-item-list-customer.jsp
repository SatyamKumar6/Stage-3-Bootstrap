<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>truYum</title>
        <style>
			.navbar{
				background-color: orangered;
			}
			.footer{
				
			   	
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
			.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

			* {
  box-sizing: border-box;
}

.headimag {
  width: 100%;
  height: 400px;
}

div#form-box {
  margin-top: -250px;
  
  text-align: center;
}

div#input-group {
  width: 80%;
  
  margin: 0 auto 20px;
  
  position: relative;

  background-color: #fff;
  
  border: none;
  border-radius: 5px;
}


input#search, label[for="email"] {
  display:inline-block;
  vertical-align: middle;
}

input#search {
  width: calc(100% - 40px);
  
  padding: 10px;
  
  border: none;
}

label[for="email"] {
  width: 40px;
  
  line-height: 40px;
}

button#btn-checkin {
  display: inline-block;
  
  padding: 6px 10px;
  
  border: none;
  border-radius: 5px;
  background-color: #EC008c;
  color: #fff;
  
  text-align: center;
  text-transform: uppercase;
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
						  <a class="nav-link" href="showPage">MenuItem</a>
						</li>
						<li class="nav-item active">
						  <a class="nav-link" href="showCart">Cart</a>
						</li>
						
					  </ul>
					</div>
			</nav>
		</header>
		
		<img class="headimag" src="https://images.unsplash.com/photo-1579065934361-0a0c8771812a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"  alt="search" />
		<div id="form-box">
			<form>
				<div id="input-group">
					
					<label for="search"><i class="fa fa-coffee"></i></label>
					<input type="text" placeholder="Search Food" id="search">
				</div>	
			</form>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
		</div>
				
		<div class="row">
			<c:forEach items="${inf}" var="temp">
            <div class="col-sm-3">
                <div class="card">
                  
                    <div class="card-body">
                    <div class="card-title title">
                        <div class="row">
                            <div class="col-7"><label> ${temp.name} </label></div>
                        
                        <div class="col-5">
                            <div class="price">${temp.price}</div>
                        </div>
                        </div>
                    </div>
                    <div class="card-text">
                     <div class="row">
                        <div class="col-6 text-title">
                           <div><label class="statusActive">Active</label> <label> ${temp.category} </label></div>
                        </div>
                        <div class="col-6 text-title">
                           <div class="float-right">
                            <div>
                               Launch
                            </div>    
                            <div>  ${temp.dateOfLaunch}  </div>
                            </div>
                            </div> 
                     </div>           
                     <div class="row">
                        <div class="col-6 addCart">
                            <button type="button" class="btn btn-primary" >
                                View
                              </button>
                     </div>
                        <div class="col-6">
                            <div class="addFav float-right">
                          <a href="cart?id=${temp.id}">
                          <i onclick="myFunction(this)" class="fa fa-heart"></i>
                          </a>
                        </div>
                     </div>
                     </div>
                      
                </div>
                </div>
           </div>
            </div>
          
           </c:forEach>
		</div>
        
		
		
			
    	  
		<footer class="footer">
			<div class="row">
				<div class="col-md-6">
					<p>Copyright &copy; 2019 </p>
				</div>
			</div>
		</footer>          
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
	
	

</html>
