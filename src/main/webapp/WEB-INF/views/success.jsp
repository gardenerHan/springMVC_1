<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/12
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>success page</h4>
    time:${requestScope.time}
    <br><br>
    names:${requestScope.names}
    <br><br>
    request user :${requestScope.user}
    <br><br>
    session user :${sessionScope.user}
    <br><br>
    request likeColor :${requestScope.likeColor}
    <br><br>
    session likeColor :${sessionScope.likeColor}

    <br><br>
    <fmt:message key="i18n.username"></fmt:message>
    <br><br>
    <fmt:message key="i18n.password"></fmt:message>
    
</body>
</html>
