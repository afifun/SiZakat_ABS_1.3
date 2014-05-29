<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<!--  <link href="Metro-UI-CSS-master/docs/css/jquery.dataTables.css"
	rel="stylesheet">-->

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
<table class="table striped hovered dataTable" id="dataTables-1">
	<thead>
		<tr>
			<th class="text-left">Engine</th>
			<th class="text-left">Browser</th>
			<th class="text-left">Platform</th>
			<th class="text-left">Version</th>
			<th class="text-left">CSS grade</th>
		</tr>
	</thead>

	<tbody>
	</tbody>

	<tfoot>
		<tr>
			<th class="text-left">Engine</th>
			<th class="text-left">Browser</th>
			<th class="text-left">Platform</th>
			<th class="text-left">Version</th>
			<th class="text-left">CSS grade</th>
		</tr>
	</tfoot>
</table>

<script>
                $(function(){
                    $('#dataTables-1').dataTable( {
                        "bProcessing": true,
                        "sAjaxSource": "Metro-UI-CSS-master/docs/data/dataTables-objects.txt",
                        "aoColumns": [
                            { "mData": "engine" },
                            { "mData": "browser" },
                            { "mData": "platform" },
                            { "mData": "version" },
                            { "mData": "grade" }
                        ]
                    } );
                });
            </script>
</html>