<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.body{
	margin:0;
	padding:0;
	background: linear-gradient(120deg,#2980b9,#8e44ad);
	height:100vh;
}
.center{
position:absolute;
top: 15%;
left: 35%;
transform:tranlate(-50%, -50%);
width:400px;
background:white;
border-radius:10px;
}
.center h1{
text-align: center;
text-color:#B24BF3;
padding: 0 0 20px 0;
border-bottom: 1px solid silver;
}
.center form{
padding: 0 40px;
box-sizing : border-box;
}
form .txt-field{
position: relative;
border-bottom: 2px solid #adadad;
margin: 30px 0;
}
.txt-field input{
width: 100%;
top:10%;
padding: 0 5px;
height: 40px;
background: none;
outline: none;
}
.txt-field label{
position: absolute;
top: -50%;
left: 5px;
color: #adadad;
tranform: translateY(-50%);
front-size: 16px;
pointer-events: none;
transition: .5s;
}
.txt-field span::before{
content:'';
position: absolute;
top: 40%;
left: 0;
width: 0%;
height: 2px;
background: #2691d9;
transition: .5s;
}
.txt-field input:focus ~ label,
.txt-field input:valid ~ label{
top: -5px;
color: 2691d9;
}
.txt-field input:focus ~ span::before,
.txt-field input:valid ~ label::before{
width: 100%;
}
.pass{
margin: -5px 0 20px 5px;
color: #a6a6a6;
cursor: pointer;
}

input[type="submit"]{
width: 100%;
height: 50px;
margin: 0 0 20px 0;
border: 1px solid;
background:	#2691d9;
border-radius: 25px;
front-size: 18px;
color: #e9f4fb;
front-weight: 700;
cursor: pointer;
outline: none;
}	
</style>
<title>Sign up</title>
</head>
<body class="body"><div class="center">
<form method=post action=RegisterServlet >
<h1>Sign up</h1>
<div class="txt-field">
<label>LastName</label>
<input type="text" name="nom"><br>
</div>
<div class="txt-field">
<label>FirstName</label>
<input type="text" name="prenom"><br>
</div>
<div class="txt-field">
<label>Username</label>
<input type="text" name="username"><br>
</div>
<div class="txt-field">
<label>Email</label>
<input type="email" name="email"><br>
</div>
<div class="txt-field">
<label>Password</label>
<input type="password" name="password"><br>
</div>
<input type="submit" value="Sign up">
</form></div>
</body>
</html>