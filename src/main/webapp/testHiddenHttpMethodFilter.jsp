<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/12
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestHiddenHttpMethodFilter</title>
</head>
<body>
    <a href="springmvc/testRest/1">Test Rest Get</a>
    <br><br>
    <form method="post" action="springmvc/testRest">
        <input type="submit" value="submit">
    </form>
    <br><br>
    <form method="post" action="springmvc/testRest/1">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="TestRest DELETE">
    </form>

    <br><br>
    <form method="post" action="springmvc/testRest/1">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="TestRest PUT">
    </form>
</body>
</html>
