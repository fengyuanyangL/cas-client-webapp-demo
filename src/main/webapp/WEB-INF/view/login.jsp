<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<form  action="submit.jhtml" method="post"><br> 
		username:<input name="username" /></br> 
		password:<input name="password" type="password"/></br>
		<input type="submit" value="login"/></br>
		<input type="button" value="退出单点登录" onclick="loginout()"/>
	</form>
</body>
<script>
	function loginout() {
		window.location.href="http://10.200.120.34:8080/cas/logout";
    }
</script>
</html>