<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration...!</title>
</head>
<body>

	<div align="center">
		<h1>Student Registration Form....</h1>
		<form action="<%=request.getContextPath()%>/register" method="post">
			<table style="">
				<tr>
					<td>Student ID :</td>
					<td><input type="text" name="studentID" /></td>
				</tr>

				<tr>
					<td>First Name :</td>
					<td><input type="text" name="firstName" /></td>
				</tr>

				<tr>
					<td>Last Name :</td>
					<td><input type="text" name="lastName" /></td>
				</tr>

				<tr>
					<td>User Name :</td>
					<td><input type="text" name="userName" /></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" /></td>
				</tr>

				<tr>
					<td>Current Year :</td>
					<td><input type="text" name="year" /></td>
				</tr>

				<tr>
					<td>Current GPA :</td>
					<td><input type="text" name="GPA" /></td>
				</tr>

				<tr>
					<td>Contact NO :</td>
					<td><input type="text" name="contact" /></td>
				</tr>
			</table>

			<input type="submit" value="Submit" />


		</form>
	</div>

</body>
</html>