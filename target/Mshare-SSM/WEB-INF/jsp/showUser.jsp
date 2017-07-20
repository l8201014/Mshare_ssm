<%@ page import="java.util.List" %>
<%@ page import="com.zwn.model.UserEntity" %><%--
  Created by IntelliJ IDEA.
  UserEntity: Administrator
  Date: 2017/5/26
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="userList" items="${userList}">
        姓名：${userList.username} &nbsp;&nbsp;手机号：${userList.password} &nbsp;&nbsp;邮箱：${userList.email} &nbsp;&nbsp;<br>
    </c:forEach>

</body>
</html>
