<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
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

<form>
	<fieldset>
		<label>Nama</label>
		<div class="input-control text" data-role="input-control">
			<input type="text" placeholder="type text">
			<button class="btn-clear" tabindex="-1"></button>
		</div>
		<label>Deskripsi</label>
		<div>
			<textarea style="width: 100%; height: 200px"></textarea>
		</div>
		<label>Tanggal</label> <input class="input-control text"
			id="datePicker" type="date" />

		<script>
			$(function() {

				$("#datePicker").igDatePicker();

			});
		</script>

		<label>Target</label>
		<div class="input-control text" data-role="input-control">
			<input type="text" placeholder="type text">
			<button class="btn-clear" tabindex="-1"></button>
		</div>
		<label>Biaya</label>
		<div class="input-control text" data-role="input-control">
			<input type="text" placeholder="type text">
			<button class="btn-clear" tabindex="-1"></button>
		</div>
		<label>Status</label>
		<div class="input-control text" data-role="input-control">
			<input type="text" placeholder="type text">
			<button class="btn-clear" tabindex="-1"></button>
		</div>
		<label>Foto</label>

		<div class="input-control text" data-role="input-control">
			<input type="file" name="pic" accept="image/*">
		</div>


		<button class="button large primary" style="margin-top: 20px">Simpan</button>
	</fieldset>

</form>



</html>