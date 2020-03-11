xmlns:mvc="http://www.springframework.org/schema/mvc"<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/customer.css"/>
Customer registration form
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
	First name : <form:input path="firstName" />
	<br><br>
	Last name (*) : <form:input path="lastName" />
	<form:errors path="lastName" cssClass="error"></form:errors>
	<br><br>
	freePasses (*) : <form:input  path="freePasses" />
	<form:errors path="freePasses" cssClass="error"></form:errors>
	<br><br>
	Postal Code  : <form:input  path="postalCode" />
	<form:errors path="postalCode" cssClass="error"></form:errors>
	<br><br>
	Course Code  : <form:input  path="courseCode" />
	<form:errors path="courseCode" cssClass="error"></form:errors>
	<br><br>
	
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>