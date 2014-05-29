<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon"
	href="bootstrap-3.1.1/docs/assets/ico/favicon.ico">

<title>Carousel Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="bootstrap-3.1.1/docs/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="bootstrap-3.1.1/docs/examples/carousel/carousel.css" rel="stylesheet">
</head>
<!-- NAVBAR
================================================== -->
<!-- Docs master nav -->
<header class="navbar navbar-static-top navbar-inverse bs-docs-nav" id="top"
	role="banner">
<div class="container bs-docs-container">
	<div class="navbar-header">
		<button class="navbar-toggle" type="button" data-toggle="collapse"
			data-target=".bs-navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<h3 href="../" class="text-muted">SiZakat</h3>
	</div>
	<nav class="collapse navbar-collapse bs-navbar-collapse"
		role="navigation">
	<ul class="nav navbar-nav navbar-right">
		<li><a href="../getting-started">Halaman Utama</a></li>
		<li><a href="../css">Program</a></li>
		<li><a href="../components">Tentang</a></li>
		<li><a href="../customize">Kontak Kami</a></li>
		<li><a href="LoginView.jsp"type="button" class="btn btn-default navbar-btn">Login</a></li>
	</ul>

	</nav>
</div>
</header>


<div class="row bs-docs-container">
<div class="col-md-8">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>
	<div class="carousel-inner">
		<div class="item active">
			<img
				src="http://www.mosapog.org/wp-content/uploads/2013/10/nature-q-c-900-500-6.jpg"
				alt="First slide">
			<div class="container">
				<div class="carousel-caption">
					<h1>Example headline.</h1>
					<p>
						Note: If you're viewing this page via a
						<code>file://</code>
						URL, the "next" and "previous" Glyphicon buttons on the left and
						right might not load/display properly due to web browser security
						rules.
					</p>
					<p>
						<a class="btn btn-lg btn-primary" href="#" role="button">Sign
							up today</a>
					</p>
				</div>
			</div>
		</div>
		<div class="item">
			<img
				src="http://www.gsd.harvard.edu/images/content/6/1/v4/614572.jpg"
				alt="Second slide">
			<div class="container">
				<div class="carousel-caption">
					<h1>Another example headline.</h1>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.
						Donec id elit non mi porta gravida at eget metus. Nullam id dolor
						id nibh ultricies vehicula ut id elit.</p>
					<p>
						<a class="btn btn-lg btn-primary" href="#" role="button">Learn
							more</a>
					</p>
				</div>
			</div>
		</div>
		<div class="item">
			<img
				src="http://www.heartcyprus.com/content/things_to_do/walking_and_hiking/kalevounari-nature-path/02.jpg"
				alt="Third slide">
			<div class="container">
				<div class="carousel-caption">
					<h1>One more for good measure.</h1>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.
						Donec id elit non mi porta gravida at eget metus. Nullam id dolor
						id nibh ultricies vehicula ut id elit.</p>
					<p>
						<a class="btn btn-lg btn-primary" href="#" role="button">Browse
							gallery</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	
	
	<a class="left carousel-control" href="#myCarousel" data-slide="prev"><span
		class="glyphicon glyphicon-chevron-left"></span></a> <a
		class="right carousel-control" href="#myCarousel" data-slide="next"><span
		class="glyphicon glyphicon-chevron-right"></span></a>
</div>
<!-- /.carousel -->
</div>

<div class="col-md-4">
	<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Data</div>
  <!-- <div class="panel-body">
    <p>asdasdasdas</p>
  </div>-->
  <!-- Table -->
  <table class="table">
		<tr>
		  <th>No.</th>
		  <th>Program</th> 
		  <th>Kebutuhan</th>
		  <th>Realisasi</th>
		</tr>	
		<tr>
		  <td>1</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>2</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>3</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>4</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>5</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>6</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>7</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>8</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>9</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>10</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		<tr>
		  <td>11</td>
		  <td>Pembangunan Masjid</td>
		  <td>100.000.000</td>		
		  <td>150.000.000</td>
		</tr>
		
  </table>
</div>
</div>
</div>

<div class="row" style="margin-top:30px">
	<div class="col-sm-6 col-md-4">
		<div class="thumbnail">
			<img data-src="holder.js/300x200" alt="...">
			<div class="caption">
				<h3>Thumbnail label</h3>
				<p>saffswafafaf</p>
				<p>
					<a href="#" class="btn btn-default" role="button">View details
						>></a>
				</p>
			</div>
		</div>
	</div>
	<div class="col-sm-6 col-md-4">
		<div class="thumbnail">
			<img data-src="holder.js/300x200" alt="...">
			<div class="caption">
				<h3>Thumbnail label</h3>
				<p>saffswafafaf</p>
				<p>
					<a href="#" class="btn btn-default" role="button">View details
						>></a>
				</p>
			</div>
		</div>
	</div>
	<div class="col-sm-6 col-md-4">
		<div class="thumbnail">
			<img data-src="holder.js/300x200" alt="...">
			<div class="caption">
				<h3>Thumbnail label</h3>
				<p>saffswafafaf</p>
				<p>
					<a href="#" class="btn btn-default" role="button">View details
						>></a>
				</p>
			</div>
		</div>
	</div>
</div>

<footer class="bs-docs-footer">

<p class="pull-right">
	<a href="#">Back to top</a>
</p>
<p>
	&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a
		href="#">Terms</a>
</p>
<ul class="list-group">
</footer>




<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="bootstrap-3.1.1/docs/dist/js/bootstrap.min.js"></script>
<script src="bootstrap-3.1.1/docs/assets/js/docs.min.js"></script>

</body>
</html>
