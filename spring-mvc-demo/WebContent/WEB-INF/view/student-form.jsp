<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/student.css"/>
Student form
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name : <form:input path="firstName" />
	<br><br>
	Last name : <form:input path="lastName" />
	<br><br>
	<form:select path="country">
		<form:options items="${countryOptions}"/>
	</form:select>
	<br><br>
	Favorite Language
	<div class="favorite-language">
		 <form:radiobuttons path="favoriteLanguage" items="${favoriteLanguage}"/>
	</div>
	<br><br>
	Operating Systems
	<div class="favorite-language">
		 <form:checkboxes path="operatingSystems" items="${operatingSystems}"/>
	</div>
	<br><br>
	
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>