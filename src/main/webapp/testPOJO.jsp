<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/13
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>POJO</title>
</head>
<body>
<form action="/springmvc/testPOJO" method="post">
    <br>
    username:<input type="text" name="username">
    <br>
    password:<input type="password" name="password">
    <br>
    age:<input type="text" name="age">
    <br>
    email:<input type="text" name="email">
    <br>
    city:<input type="text" name="address.city">
    <br>
    provice:<input type="text" name="address.provice">
    <br>
    <input type="submit" value="submit">

</form>
</body>
</html>
