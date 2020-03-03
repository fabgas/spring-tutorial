<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/student.css"/>
<title>Student confirmation </title>
</head>
<body>
	The Student is ${student.firstName} ${student.lastName} 
	<br><br>
	Country : ${student.country}
	<br><br>
	Favorite Language ${student.favoriteLanguage}
	<br><br>
	<ul>
		<c:forEach var="temp" items = "${student.operatingSystems}" >
			<li>${temp} </li>
		</c:forEach>
	</ul>
</body>
</html>