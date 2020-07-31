<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2020/7/30
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://shiro.apache.org/tags"  prefix="shiro"%>
<html>

<head>
    <title>Title</title>
</head>
<body>
<%--guest在没有认证时，里面访问标签内的内容--%>
<shiro:guest>
    游客身份
</shiro:guest><br>
<%--user表示认证成功可以访问标签内的内容--%>
<shiro:user>
    欢迎<shiro:principal></shiro:principal>登录成功<br>
</shiro:user>
<%--hasRole 具有name里面角色可以执行标签内的内容--%>
<shiro:hasRole name="user">
<a href="/user.jsp">user</a><br>
</shiro:hasRole>
<shiro:hasRole name="admin">
    <a href="/admin.jsp">admin</a><br>
</shiro:hasRole>
<%--lacksRole 不具有name里面角色可以执行标签内的内容--%>
<shiro:lacksRole name="admin">
    我没有admin这个角色<br>
</shiro:lacksRole>
<p ></p>
   <a href="/pc/logout">退出用户</a>

<a href="/pc/testAnnotions.do">测试shiro</a>
</body>
</html>
