<%--
  Created by IntelliJ IDEA.
  User: 11299
  Date: 2018/4/23
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful index</title>
    <script type="text/javascript" src="/scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
          $("#testJson").click(function () {
              var url = this.href ;
              $.post(url,function (data) {
                  for (var i = 0 ; i < data.length ;i++){
                    var id = data[i].id ;
                    var lastName = data[i].lastName ;

                    alert(id+" : "+lastName) ;
                  }
              }) ;
              return false ;
          }) ;
        })
    </script>
</head>
<body>
    <a href="/emps">list page</a>
    <br>
    <a href="/testJson" id="testJson">Test Json</a>
    <br><br>
    <form action="testHttpMessageConverter" method="post"  enctype="multipart/form-data">
        File: <input type="file" name="file"><br>
        DESC: <input type="text" name="desc"><br>
        <input type="submit" value="Submit">
    </form>

    <br><br>

    <a href="testResponseEntity" >testResponseEntity</a>

</body>
</html>
