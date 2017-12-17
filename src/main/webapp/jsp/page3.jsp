<html>
<body>

	<h1>Page 3</h1>
	<h1>
		You type
		<%=request.getParameter("target")%>
	</h1>

	<form action="IndexServlet" method="get">
		<input type="text" name="target"> <input type="submit"
			value="Valider"></input>
	</form>


</body>
</html>
