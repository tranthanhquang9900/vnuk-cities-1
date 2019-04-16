<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding contacts</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<c:import url="header.jsp" />
	<h1>Adding a city</h1>
	
	<form action="addCity">
		<div>
			<label for="city"> City: </label>
			<input type="text" id="city" name="city">
		</div>
		
		<div>
			<label for="province"> Province: </label>
			<input type="text" id="province" name="province">
		</div>
		
		<div>
			<label for="zip-code"> Zip-code: </label>
			<input type="number" id="zip-code" name="zip_code">
		</div>
	
		<input type="submit" value = "Save">		
	</form>
	<c:import url="footer.jsp" />
</body>
</html>