<html>
<body>
	<h1>You type <%=request.getParameter("target") %>  </h1>


	<form action="Index.login" method="get">
		<input type="text" name="login">
		<input type="password" name="pwd">
		<input type="submit" value="Valider"></input>
	</form>

</body>
</html>
