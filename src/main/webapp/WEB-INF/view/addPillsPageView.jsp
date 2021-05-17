<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Umaralikhon
  Date: 17.05.2021
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

You are in the "Add page"<br>
<h2>Please add information about pills</h2>

<form:form action="/showResult" modelAttribute="pills">
    Name <form:input path="name"/><br>
    Cost <form:input path="cost"/><br>

    <input type="submit" value="Add"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
