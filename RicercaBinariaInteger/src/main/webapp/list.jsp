<!DOCTYPE html>
<%@page import="java.util.Collections"%>
<%@page import="it.cefi.models.RicercaModel"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<th align="left">Nomi</th>
				</tr>
			</thead>
			<tbody>
			<% if (!RicercaModel.list.isEmpty()) { %>
			<% Collections.sort(RicercaModel.list); %>
			<% for (int i = 0; i < RicercaModel.list.size(); i += 1) { %>

			<tr>
				<td align="left"><%=RicercaModel.list.get(i)%></td>
			</tr>
			<% } %>
			<% } %>
			</tbody>
		</table>
		<form action="inserisci" method="post">
			<input type="text" name="insert">
			<input type="submit" value="Inserisci">
		</form>>
		<a href="index.jsp" >Torna Alla Ricerca</a>
	</body>
</html>