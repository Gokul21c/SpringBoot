<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
  <label>Login</label>
  <form action="./login" method="post">
  <table border="2">
    <tr>
    <td>Username</td>
    <td><input type="text" name="username"/>
    </tr>
    <tr>
    <td>Password</td>
    <td><input type="password" name="password"/>
    </tr>
    <tr>
    <td>
    <input type="submit" value="Login">
    </tr>
    
    
  </table>
  </form>
</fieldset>
</body>
</html>