<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/30
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>注册</title>
</head>
<div id="header">
    <h1>我的好友录</h1>
    <hr/>
</div>

<div id="title1">
    <h1>用户注册</h1>
    <form method="post" action="/Register">
        <p>
            登录名称：
            <input name="UserNameIn" type="text"/>
        </p>
        <p>
            登录密码：
            <input name="PasswordIn" type="password"/>
        </p>
        <p>
            密码确认：
            <input name="PasswordCheck" type="password"/>
        </p>
        <input type="submit" name="register_button" id="register_button" value="注册"/>
        <input type="button" value="返回登录" onclick="document.location.href='/login'; return false;">
    </form>

</div>
<body>
</body>
</html>
