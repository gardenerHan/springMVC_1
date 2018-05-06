<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/5/6
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestFileuploadHandler</title>
</head>
<body>
<%--注意method="post" 必填 ,否则:
    Request processing failed; nested exception is org.springframework.web.multipart.MultipartException: Current request is not a multipart request
--%>
    <form action="testFileupload" enctype="multipart/form-data" method="post">
        File: <input type="file" name="file">
        DESC: <input type="text" name="desc">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
