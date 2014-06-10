<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring mvc with jQuery</title>
<style type="text/css">
	/*.inline{
		display: inline;
		/*float: left;
	}
	
	.inline-block{
		display: inline-block;
		/*float: right;
	}*/
	
	input, label{
		display: inline-block;
		vertical-align: baseline;
		width: 125px;
	}
	
	.postReqContainer{
		border: 1px solid black;
		width: 300px;
		margin-top: 10px;
	}
</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	$(function(){
		console.log("jquery ready!");
		
		// add padding to all child elements inside div used to post json data.
		$("#postReqContainer").find("*").css("padding","5px");
		
		$("#getJsonResp").on("click",function(event){
			$.ajax({
				url: "<%=request.getContextPath()%>" + "/HelloWorld/getPerson.do",
				type: "GET",
				dataType: 'json', 
				contentType: 'application/json',
				success: function(data){
					console.log("ajax req successfull!" + data);
					var spanElement = $("<span>");
					spanElement.text("first name is " + data.firstName + " and last name is " + data.lastName + " and gender is" + data.gender + 
							" and age is " + data.age);					
					$(spanElement).insertAfter("#getJsonResp");
				},
				error: function(){
					console.log("error occured with ajax req!");
				}
			});
		});
		
		$("#sendJsonReq").on("click",function(event){
			var postData = {
					firstName: $("#firstName").val(),
					lastName: $("#lastName").val(),
					gender: $("#gender").val(),
					age: $("#age").val()
					};
			$.ajax({
				url:  "<%=request.getContextPath()%>" + "/HelloWorld/addPerson.do",
				type: "POST",
				dataType: "json",
				contentType: "application/json",
				data:JSON.stringify(postData),
				/* headers: { 
				    'Accept': 'application/json',
				    'Content-Type': 'application/json' 
				}, */
				success: function(data){
					console.log("ajax req successfull!");
				},
				error: function(data){
					console.log("error occured with ajax req!");
				}
			});
		});
		
	});
</script>
</head>
<body>

<div id="getReqContainer">
<i>Click below button to make ajax request that returns a json </i><br>
<input id="getJsonResp" type="button" value="Get Json Response"/> <br>
</div>

<div id="postReqContainer" class="postReqContainer">
	<i>Enter below mentioned details to send data to server side as json.</i> <br>
	<label for="firstName">First Name:</label>
	<input id="firstName" type="text"/>
	<label for="lastName" >Last Name:</label>
	<input id="lastName" type="text" />
	<label for="gender">Gender:</label>
	<input id="gender" type="text" />
	<label for="age">Age:</label>
	<input id="age" type="text"/>
	
	<input id="sendJsonReq" type="button" value="Send Json Request"/>
</div>

</body>
</html>