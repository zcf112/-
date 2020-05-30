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
    <title>登录</title>
</head>
<body>
<div id="header">
    <h1>我的好友录</h1>
    <hr/>
</div>

<div id="title1">
    <h1>用户登录</h1>
    <form method="post" action="/Login">
        <p>
            登录名称：
            <input name="UserNameIn" type="text"/>
        </p>
        <p>
            登录密码：
            <input name="PasswordIn" type="password"/>
        </p>
        <input type="submit" name="login_button" id="login_button" value="登录"/>
        <input type="button" value="注册" onclick="document.location.href='/register'; return false;">
    </form>
</div>
</body>
</html>
