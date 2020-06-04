<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


<style> 


 #blurBackGround {
   border-radius: 25px;
  /* border: 2px solid #73AD21; */
  padding: 10px; 
  padding-top: 20px; 
  width: 900px;
  height: 600px; 
  background-image: url("../goEvergreen.jpg");
  filter: blur(2px);
  -webkit-filter: blur(2px);
}

.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 1px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 70%;
  transform: translate(-50%, -50%);
  z-index: 4;
  width: 50%;
  height: 70%;
  padding: 80px;
  text-align: center;
}

#rcorners2 {
  border-radius: 25px;
  border: 1px solid #73AD21;
  width: 750px;
  height: 600px; 
}

#rcorners3 {
  border-radius: 25px;
 /*  border: 2px solid #73AD21; */
  padding: 10px; 
  padding-top: 20px; 
  width: 600px;
  height: 130px; 
  background-image: url("../back9.jpg");
  
}

#rcorners4 {
  border-radius: 25px;
  /* border: 2px solid #73AD21; */
  padding: 10px; 
  padding-top: 20px; 
  width: 600px;
  height: 130px; 
  background-image: url("../back7.jpg");
   background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

#rcorners5 {
  border-radius: 25px;
  /* border: 2px solid #73AD21; */
  padding: 10px; 
  padding-top: 20px; 
  width: 600px;
  height: 130px; 
  background-image: url("../back11.jpg");
 
}

#rcorners6 {
  border-radius: 25px;
 /*  border: 2px solid #73AD21; */
  padding: 10px; 
  padding-top: 20px; 
  width: 600px;
  height: 130px; 
  background-image: url("../back6.jpg");
}


tr {
    display: block;
    padding-top: 10px;
    padding-bottom: 5px;
  }
</style>
</head>
<body>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  //setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

<div>
<%@include file="Header.jsp" %>

</div>

<div>

<table>
<tr>
<td>




<table >

<tr >
<td>
<div id="rcorners5">
<p align="center" style="color:#F8FAF7"><strong>Emergency</strong>  </p>
</div>

</td>
</tr>


<tr >
<td>
<div id="rcorners3">
<p align="center" > Care and Cure </p>

</div>
</td>

</tr>

<tr >
<td>
<div id="rcorners4" onclick="alert('hi')">

<p align="center" style="color:#F8FAF7"><strong>Go Evergreen</strong>  </p>
</div>


</td>
</tr>




<tr>
<td>
<div id="rcorners6">
<p align="center" style="color:#F8FAF7"><strong>Foods for you</strong>  </p>
</div>
</td>
</tr>


</table>
</td>

<td height="100%" width="100%">

<div id="blurBackGround" ></div>
 
<!-- <img class="mySlides" src="care.jpg" style="width:100%">
  <img class="mySlides" src="dbay.jpg" style="width:100%">
  <img class="mySlides" src="foodsForYou.jpg" style="width:100%"> -->
  <div class="bg-text">
  <h2 style="font-size:30px"><strong>We believe you deserve quality care and support that's tailored to you and your family.</strong></h2>
  <p style="color:white"><strong>Below are the details</strong></p>
  <input type="submit" style="border-radius: 6px;background-color:white;height=6px" value="Click here to know more"/>
</div>
 
 



</td>

</tr>

</table>
</div>

</body>
</html>