<%@ page isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.moviecruiser.entities.Movie" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>Movie Cruiser</title>


        <style>
			.navbar{
				background-color: purple;
			}
			.footer{


				left: 0;
			   	bottom: 0;
			   	width: 100%;
			   	background-color: purple;
			   	color: white;
				text-align: left;

			}
			.fav{
				float:right;
			}
			.fav:hover {
				color: red;
			}
			.row{
				padding-left: 10px;
				padding-right: 10px;
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

					<a class="navbar-brand" href="#" style="color: white;">
                Movie Cruiser&nbsp;
                <img src="logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02"
                aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-end" id="navbarTogglerDemo02">
                <ul class="navbar-nav mt-2 mt-lg-0" style="margin-right:20px;">
                    <li class="nav-item active">
                        <a class="nav-link" href="fmovies"
                            style="color: white;text-decoration: underline;">Movies</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="Favorites?userId=${userid }"
                            style="color: white;text-decoration: underline;">Favorites</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0" method="post" action="logout">
                    <input class="form-control mr-sm-2" type="hidden" name="${userid}">
                    <button class="btn my-2 my-sm-0" type="submit"
                        style="border:1px solid brown;background-color:brown;color: yellow;">Logout</button>
                </form>
            </div>

			</nav>
		</header>

		<!---------------------------------------------------------------------------------------------------->
		<img class="headimag" src="https://upload.wikimedia.org/wikipedia/commons/4/43/Medium_format.jpg" />
		<div id="form-box">
			<form>
				<h1 style="color: white; text-align:inherit; font-size: 50px;">Find Movie</h1>
				<div id="input-group">

					<label for="search"><i class="fa fa-film"></i></label>
					<input type="text" placeholder="Search Movie" id="search">
				</div>
			</form>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
		</div>

		<!------------------------------------------------------------------------------------------------------->
		<h6 style="text-align:center; color: green;">Movie added to favorite Successfully.</h6>
		<div class="row">
			
			<c:forEach var="movie" items="${fmovies }">
				<div class="card col-sm-3" style="width: 15rem;">
					<img class="card-img-top" src="${movie.movie_link}" alt="${movie.movie_title}">
					<div class="card-body">
						<div class="card-title">
							<span name="title">${movie.movie_title}</span>
							<span name="boxOffice" class="float-right">${movie.movie_box_of_office}</span>
						</div>
						<div>
							<span name="genre" class="text-muted"><span class="badge badge-success">${movie.movie_active}</span>${movie.movie_genre}</span>
						</div>
						<div class="bottom-wrap">
								<span class="launch"><i class="fa fa-clock-o"></i>Release Date</span>
								<a href="Add-To-Favorite?movieId=${movie.movie_id }&userId=${userid}" class="fav"><i class="fa fa-heart-o" title="Add to Favourite"></i></a>
						</div>
						<div>
							<span  name="dateOfLaunch" class="text-muted">${movie.movie_date_of_launch}</span>
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
