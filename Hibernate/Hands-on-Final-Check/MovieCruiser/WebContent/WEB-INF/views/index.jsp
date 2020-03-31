<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link rel="stylesheet" href="style.css">
    <title>Login</title>
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
			.total {
				float:right;
				color:purple;
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
			</nav>
		</header>
    <div class="container">
          <section style="padding-top: 20px;padding-bottom: 20px;">
            <div class="card col-md-6 offset-md-3" style="margin-top: 20px;margin-bottom: 20px;">

                <div class="card-body">
                    <form action="login" method="post" class="col-md-10 offset-md-1" style="margin: 30px auto;color: gray;">
                    <label class="text-danger">${msg }</label>
                        <div class="form-group">
                            <label class="userId">UserName</label>
                            <input type="text" name="userName" id="userId" required class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="userpass">Password</label>
                            <input type="password" name="userPass" id="userpass" required class="form-control">
                        </div>
                        <input type="submit" class="btn" value="Login"
                            style="background-color: steelblue;color: white;width: 150px;">
                    </form>
                </div>
            </div>
        </section>

    

    </div>
    


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>

	<footer class="footer">
			<div class="row">
				<div class="col-md-6">
					<p>Copyright &copy; 2019 </p>
				</div>
			</div>
		</footer>
</html>