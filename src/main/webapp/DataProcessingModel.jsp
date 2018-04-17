<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/13
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/springmvc/testModelAndView">testModelAndView page</a>
    <br><br>
    <a href="/springmvc/testMap">testMap page</a>
    <br><br>
    <a href="/springmvc/testSessionAttributes">testSessionAttributes page</a>

    <br><br>

    <form action="/springmvc/testModelAttribute" method="post">
        <input type="hidden" value="1" name="id">
        <br>
        username:<input type="text" name="username">
        <br>
        age:<input type="text" name="age">
        <br>
        email:<input type="text" name="email">
        <br>

        <input type="submit" value="submit">

    </form>
</body>
</html>
