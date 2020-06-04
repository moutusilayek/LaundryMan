<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Please complete your profile so that we can reach out to you in case of emergency</h1>

<form method="post" action="/submitProfile"  >

<div align="center"  style="height:50px; background-image:url(<c:url value='/resources/static/pics/welcome.jpg' />)"  >

<table border="1 px" >
<tr><td> Name: </td> <td> <input type="text" name="userName"/> </td></tr>
<tr><td> Age: </td> <td> <input type="text" name="age"/> </td></tr>
<tr><td> Gender: </td> <td> <input type="text" name="gender"/> </td></tr>
<tr><td> Phone Number: </td> <td> <input type="text" name="mobileNumber"/> </td></tr>
<tr><td> Address Line 1: </td> <td> <input type="text" name="addressLine1"/> </td></tr>
<tr><td> Address Line 2 </td> <td> <input type="text" name="addressLine2"/> </td></tr>
<tr><td> City </td> <td> <input type="text" name="City"/> </td></tr>
<tr><td> State </td> <td> <input type="text" name="state"/> </td></tr>
<tr><td> Landmark: </td> <td> <input type="text" name="landmark"/> </td></tr>
<tr><td> Alternate ph no. 1 </td> <td> <input type="text" name="alternatePhoneNumber1"/> </td></tr>
<tr><td> Alternate ph no. 1 </td> <td> <input type="text" name="alternatePhoneNumber2"/> </td></tr>
<tr><td> Altername Contact Person: </td> <td> <input type="text" name="alternateContactPerson"/> </td></tr>
<tr><td> Health Issues </td> <td> <input type="text" name="healthIssues"/> </td></tr>
<tr><td> Regular medications </td> <td> <input type="text" name="regularMedications"/> </td></tr>
<tr><td> Mediclaim Number </td> <td> <input type="text" name="mediclaimNumber"/> </td></tr>

<tr><td/><td> <input type="submit"/> </td></tr>
</table>


</div>

</form>


</body>
</html>