<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/30
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>主页面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <%
        String userName = (String) request.getAttribute("userName");
    %>
    <script type="text/javascript" src="/js/jquary-3.4.1.min.js"></script>
</head>
<body>
<div id="header">
    <h1>我的好友录</h1>
    <hr/>
</div>

<div title="jump">
    <a href="localhost:8080/queryByName.jsp?name=合肥">查询所有好友信息</a>
    <%=userName%>
</div>
<div>
    <a href="localhost:8080/allfriend.jsp?name=<%=userName%>">按名字模糊查询好友消息</a>
</div>
<input type="hidden" id="idTest" value="<%=userName%>">
</body>
</html>
