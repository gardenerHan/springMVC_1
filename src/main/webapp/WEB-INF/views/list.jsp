<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/23
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>restful crud list</title>
    <%--处理静态资源--%>
    <script type="text/javascript" src="/scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".delete").click(function () {
                var href = $(this).attr("href") ;
                $("form").attr("action",href).submit() ;
                return false ;
            }) ;
        })
    </script>
</head>
<body>


<form name="form" method="post" action="">
    <input type="hidden" name="_method" value="DELETE">
</form>

<c:if test="${employees == null || employees.size()==0}">
    <p style="color: red;">没有任何内容</p>
</c:if>

<c:if test="${employees != null && employees.size() != 0}">
    <table border="1" cellspacing="0" cellpadding="10">
        <tr>
            <td>ID</td>
            <td>LastName</td>
            <td>Email</td>
            <td>Gender</td>
            <td>Department</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${requestScope.employees }" var="emp">
            <tr>
                <td>${emp.id }</td>
                <td>${emp.lastName }</td>
                <td>${emp.email }</td>
                <td>${emp.gender == 0 ? 'Female' : 'Male' }</td>
                <td>${emp.department.departmentName }</td>
                <td><a href="emp/${emp.id}">Edit</a></td>
                <td><a class="delete" href="emp/${emp.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br><br>

<a href="emp">Add New Employee</a>

</body>
</html>
