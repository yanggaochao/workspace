<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019/5/6
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form action="/login" method="post">
        <input name="loginId" type="text"/>
        <input name="loginPwd" type="password"/>
        <input type="submit" value="登陆"/>
    </form>
</body>
</html>
