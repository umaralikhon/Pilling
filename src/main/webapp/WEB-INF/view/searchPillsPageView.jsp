<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: Umaralikhon
  Date: 17.05.2021
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="/searchPills" modelAttribute="searchPillsAttr">
    Enter search pill<br>
    <form:input path="name"/>
    <input type="reset" value="Search"/>
</form:form>

<table>
    <tr>
    <th>Name</th>
    <th>Cost</th>
    <th>Amount</th>
</tr>

<c:forEach var="pill" items="${searchResult}">
    <tr>
        <td>${pill.name}</td>
        <td>${pill.cost}</td>
        <td>${pill.amount}</td>
    </tr>
</c:forEach>
</table>
<br><br>

<form:form>
<input type="submit" formaction="/" value="MAIN"/>
<input type="submit" formaction="/addPills" value="ADD"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
