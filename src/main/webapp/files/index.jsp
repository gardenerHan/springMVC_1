<html>
<body>
    <h2>Hello World!</h2>
    <a href="helloworld">hello world</a>
    <br><br>
    <a href="/springmvc/testRequestMapping">TestRequestMapping page</a>
    <br><br>
    <%--

    <a href="/springmvc/testMethod">TestMethod page </a>
    不支持post请求
    --%>

    <a href="springmvc/testParamAndHeaders?username=1233&age=11">testParamAndHeaders page</a>
    <br><br>
    <form action="/springmvc/testMethod" method="post">
       <input type="submit" value="submit2">
    </form>

    <br><br>
    <a href="/springmvc/testAntPath/mmm/abc" >test AntPath</a>

    <br><br>
    <a href="/springmvc/testPathVariable/1" >test PathVariable</a>

</body>
</html>
