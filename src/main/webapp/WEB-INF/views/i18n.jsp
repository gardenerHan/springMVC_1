<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>i18n</title>
</head>
<body>
    <fmt:message key="i18n.username"></fmt:message>
    <a href="i18n2">i18n2 page</a>

    <a href="i18n?locale=zh_CH">中文</a>
    <a href="i18n?locale=en_US">英文</a>
</body>
</html>
