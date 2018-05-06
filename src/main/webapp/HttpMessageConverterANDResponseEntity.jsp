<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/5/6
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="testHttpMessageConverter" method="post"  enctype="multipart/form-data">
    File: <input type="file" name="file"><br>
    DESC: <input type="text" name="desc"><br>
    <input type="submit" value="Submit">
    </form>
    <br><br>
    <a href="testResponseEntity" >testResponseEntity</a>


    <br><br>
</body>
</html>
