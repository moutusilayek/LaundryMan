<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

body {
  background-image: url("../care.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  
}

#rcorners1 {
  border-radius: 25px;
  /* border: 2px solid #73AD21; */
   width: 100px;
  height: 50px;
  color: white;
   background-color: red;
   
  
 
}
#rcorners2 {
  border-radius: 25px;
  /* border: 2px solid #73AD21; */
   width: 100px;
  height: 50px;
  color: white;
  background-color: green;
  
  
 
}

</style>
</head>
<body>

<div>
<%@include file="Header.jsp" %>

</div>

<h3 style="padding-left: 40px">Welcome ${user.userName}.. Happy to serve you</h3>


<form action="/emergencyAssistance">
<div style="padding-left:40px">
<p> If you need urgent help, please press emergency Button </p>

<input type="submit" value="EMERGENCY"  id="rcorners1"/>

</div>

</form>

<form action="/happyLife">
<div style="padding-left:40px">
<p> For other services please click on </p>

<input type="submit" value="Go Evergreen"  id="rcorners2"/>

</div>

</form>

</body>
</html>