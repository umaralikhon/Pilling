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

<form:form action="/savePills" modelAttribute="pills">
    Name <form:input path="name"/><br><br>
    Cost <form:input path="cost"/><br><br>
    Amount<form:input path="amount"/><br><br>

    <input type="submit" value="ADD"/>
</form:form>

<form:form>
<input type="submit" formaction="/searchPills" value="SEARCH">
<input type="submit" formaction="/" value="MAIN"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
