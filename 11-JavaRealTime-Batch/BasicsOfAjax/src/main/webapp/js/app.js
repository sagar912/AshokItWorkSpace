
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