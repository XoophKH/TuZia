<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>RicercaBinaria</title>
	</head>
	<body>
		
		<h3>Ricerca Binaria</h3>
		
		<hr>
		
		<% if(request.getAttribute("output") != null){%>
			<%= request.getAttribute("output")%>
		<%} %>
		
		<form action="controlla" method="post">
			<input type="text" name="input">
			<input type="submit" value="controlla">
		</form>
		
		<a href="list.jsp">Vai Alla Lista</a>
			
	</body>	
</html>