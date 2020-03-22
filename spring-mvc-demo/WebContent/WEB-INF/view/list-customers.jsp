<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
Customer registration form
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		<input type="button" value ="Add customer" onclick="window.location.href='showFormForAdd'; return false;"
		class="add-button"/>
			<table>
				<tr>
					<th> first Name</th>
					<th> Last Name </th>
					<th> Email </th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>