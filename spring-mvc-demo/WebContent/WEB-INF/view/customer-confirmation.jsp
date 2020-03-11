<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/student.css"/>
<title>Customer confirmation </title>
</head>
<body>
	The Student is ${customer.firstName} ${customer.lastName} 
	<br><br>
	He has ${customer.freePasses} freePasses
	<br><br>
	Postal Code ${customer.postalCode} 
	<br><br>
	course code is ${courseCode}
</body>
</html>