<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
				position: fixed;
			   	left: 0;
			   	bottom: 0;
			   	width: 100%;
			   	background-color: orangered;
			   	color: white;
				text-align: left;
			   	
			}
			.body{
				padding-top: 90px;
			}
			.name {
				float:left:
			}
			.price {
			
				float:right;
				color:red;
			}
			.fa {
				float:right;
			}
			.total {
				float:left:
				font-weight:bold;
				font-size:30px;
			}
        </style>
    </head>
    
	<header>
              <nav class="navbar navbar-expand-md navbar-dark fixed-top">
                <a class="navbar-brand" href="#">truYum</a>
                <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="navbar-collapse collapse" id="navbarCollapse" style="">
                  <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
              
                      <a class="nav-link" href="menu-item-customer.html">Menu Item</a>
                    </li>
                  </ul>
                </div>
              </nav>
        </header>
		<footer class="footer">
			  <div class="container">
				<span>Copyright 2019</span>
			  </div>
		</footer>
    <body class="body">
    <div class="title1">Cart</div>
	    <div class="container-fluid">
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
            </div>         
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
