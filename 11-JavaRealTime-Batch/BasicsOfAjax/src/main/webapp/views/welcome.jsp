<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="./js/jquery-3.5.1.js"></script>
<script src="./js/app.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#name").keyup(function() {
			var element = $("#name").val();

			$.ajax({
				type : "GET",
				url : window.location + "/welcome",
				data : "name=" + element,
				success : function(result) {
					$("#response").html(result);
				},
				error : function() {
					alert("error occured");
				}
			});
		});

	});
</script>
<body>
	<form>
		Enter Name: <input type="text" name="name" id="name"></input> <br>
		<br> <br>
	</form>

	<div id="response"></div>

</body>
</html>