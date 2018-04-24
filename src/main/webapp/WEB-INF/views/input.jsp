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

<html>
<head>
    <title>restful CRUD input</title>
</head>
<body>
<form:form action="emp" method="post" modelAttribute="employee">
    LastName: <form:input path="lastName"></form:input>
    <br>
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
