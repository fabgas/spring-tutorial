xmlns:mvc="http://www.springframework.org/schema/mvc"<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
Customer registration form
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h2>CRM - Customer Relationship Manager</h2>
	</div>
</div>
	<form:form action="processForm" modelAttribute="customer">
	
	</form:form>
</body>
</html>