<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

body {
  background-image: url("../welcome.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

</style>

<script type="text/javascript">

function checkUserName(){
	var userName=document.getElementById('userName').value;
	
	if(userName==null || userName==''){
		alert("pls fill in this field");
		
	}
	return false;
}

</script>




</head>
<body >



<h1 align="center"></h1>


<form method="post" action="/login"  >

<div align="center" >

<table  >
<tr><td> UserName: </td> <td> <input type="text" id="userName" name="userName" required/> </td></tr>
<tr><td> password: </td> <td> <input type="password" id="password" name="password"  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/> </td></tr>

<tr><td/><td> <input type="submit"  value="Login"/> <a href="/register">Register now</a> </td></tr>

</table>


</div>

</form>

</body>
</html>