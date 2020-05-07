<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/4/30
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/spring/helloServlet" method="post">
    用户名：<input type="text" id="username" name="username"/></br>
    密码：<input type="password" id="password" name="password"/></br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="javascript:document.location.href='/spring/register1'; return false;">
</form>
</body>
</html>
