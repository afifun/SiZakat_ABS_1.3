<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
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

<title>SiZakat</title>

<style>
.container {
	width: 1040px;
}
</style>



</head>

<jsp:include page="header.jsp" flush="false" />
<body class="metro">

	<!-- NAVBAR
================================================== -->
	<!-- Docs master nav -->
	<!-- Fixed navbar -->


	<div class="container">

		<div class="main-content clearfix">
			<a href="#"><h2 class="tile-group-title fg-orange">PROGRAM</h2></a>
			<div class="tile-area no-padding clearfix">
				<div class="tile-group no-margin no-padding clearfix"
					style="width: 100%">
					<jsp:include page="table.jsp" flush="false" />
				</div>
			</div>
		</div>
	</div>

	<script src="Metro-UI-CSS-master/docs/js/hitua.js"></script>

</body>
<jsp:include page="footer.jsp" flush="false" />


<script>

</script>


<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

</body>
</html>
