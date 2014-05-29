<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>

    <!-- Ignite UI Required Combined CSS Files -->
    <link href="datepicker/css/infragistics.theme.css" rel="stylesheet" />
    <link href="datepicker/css/infragistics.css" rel="stylesheet" />

    <script src="datepicker/js/modernizr-latest.js"></script>
    <script src="datepicker/js/jquery-1.9.1.min.js"></script>
    <script src="datepicker/js/jquery-ui.min.js"></script>

    <!-- Ignite UI Required Combined JavaScript Files -->
    <script src="datepicker/js/infragistics.core.js"></script>
    <script src="datepicker/js/infragistics.lob.js"></script>
    <style>
        @media all and (max-width: 360px) {
            .ui-datepicker {
                width: 250px;
            }
        }
    </style>
</head>
<body>
        
    <input id="datePicker" type="date" />
    <!-- Date Picker can also be instantiated with a div -->
    <!--<div id="datePicker"></div>-->

    <script>
        $(function () {

            $("#datePicker").igDatePicker();

        });
    </script>

</body>
</html>