<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Isogram</title>
	</head>
	<body>
		<h3>Isogram</h3>
		
		<%if(request.getAttribute("output")!= null){ %>
		
			<p>
				<%= request.getAttribute("output") %>
			</p>
		
		<%} %>
		
		<form action="check" method="post">
			<input type="text" name="frase">
			<input type="submit" value="Controlla">
		</form>

	</body>
</html>