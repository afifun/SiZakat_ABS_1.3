<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="product" content="Metro UI CSS Framework">
<meta name="description" content="Simple responsive css framework">
<meta name="author" content="Sergey S. Pimenov, Ukraine, Kiev">

<link href="Metro-UI-CSS-master/docs/css/metro-bootstrap.css"
	rel="stylesheet">
<link href="Metro-UI-CSS-master/docs/css/metro-bootstrap-responsive.css"
	rel="stylesheet">
<link href="Metro-UI-CSS-master/docs/css/iconFont.css" rel="stylesheet">
<link href="Metro-UI-CSS-master/css/ganteng.css" rel="stylesheet">
<!--<link href="Metro-UI-CSS-master/docs/css/docs.css" rel="stylesheet">-->
<link href="Metro-UI-CSS-master/docs/css/jquery.dataTables.css"
	rel="stylesheet">

<!-- Load JavaScript Libraries -->
<script src="Metro-UI-CSS-master/docs/js/jquery/jquery.min.js"></script>
<script src="Metro-UI-CSS-master/docs/js/jquery/jquery.widget.min.js"></script>
<script src="Metro-UI-CSS-master/docs/js/jquery/jquery.mousewheel.js"></script>
<script src="Metro-UI-CSS-master/docs/js/jquery/jquery.dataTables.js"></script>
<script src="Metro-UI-CSS-master/docs/js/prettify/prettify.js"></script>

<!-- Metro UI CSS JavaScript plugins -->
<script src="Metro-UI-CSS-master/docs/js/load-metro.js"></script>

<!-- Local JavaScript -->
<script src="Metro-UI-CSS-master/docs/js/github.info.js"></script>

<style>
.container {
	width: 1140px;
}
</style>
</head>
<header class="container">

<div class=" margin20 nrm nlm">

	<div class="container">
		<div class="clearfix">
			<div class="place-right">
				<!--  <form>
					<div class="input-control text size6 margin20 nrm">
						<input type="text" name="q" placeholder="Search...">
						<button class="btn-search"></button>
					</div>
				</form>-->
			</div>
			<a class="place-left" href="#" title="">
				<h1>Sistem Informasi Zakat</h1>
			</a>
		</div>

		<div class="main-menu-wrapper">
			<ul class="horizontal-menu nlm">
				<li class="active"><a href="userLogged.jsp">Halaman Utama</a></li>
				<li><a href="program.jsp" class="dropdown-toggle">Program</a>
					<ul class="dropdown-menu" data-show="hover">
						<li><a href="program.jsp">Lihat Program</a></li>
						<li><a href="inputProgram.jsp">Input Program</a></li>
					</ul>
				</li>
				<li><a href="#about">Tentang Kami</a></li>
				<li><a href="kontakKami.jsp">Kontak Kami</a></li>

				<li class="place-right"><a href="#" class="dropdown-toggle">admin</a>
					<ul class="dropdown-menu place-right" data-show="hover">
						<li><a href="login.jsp">Login</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>

</div>


</header>
</html>

<!--  -->