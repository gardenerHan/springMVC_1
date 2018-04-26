<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/24
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>restful CRUD input</title>
</head>
<body>

    <form action="testConversionServiceConverer" method="post">
        <%--KK-kk@sicnu.com-0-105--%>
        Employee: <input type="text" name="employee">
        <input type="submit" value="Submit">
    </form>

<%----%>
<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="employee">
    <c:if test="${employee.id == null}">
    LastName: <form:input path="lastName"></form:input>
    </c:if>
    <br>

    <c:if test="${employee.id != null}">
        <form:hidden path="id"></form:hidden>
        <input type="hidden" name="_method" value="PUT">
    </c:if>
    Email:<form:input path="email"></form:input>
    <br>
    <%
        Map<String,String> genders = new HashMap<>() ;
        genders.put("0","Male") ;
        genders.put("1","Female") ;
        request.setAttribute("genders",genders);
    %>
    Gender:<form:radiobuttons path="gender" items="${genders}" delimiter="&nbsp;&nbsp;"></form:radiobuttons>
    <br>
    Department:<form:select path="department.id" items="${departments}" itemLabel="departmentName" itemValue="id" ></form:select>
    <br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
