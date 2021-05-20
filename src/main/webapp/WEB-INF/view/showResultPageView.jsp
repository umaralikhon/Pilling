<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: umara
  Date: 17.05.2021
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>Name</th>
        <th>Cost</th>
    </tr>

    <c:forEach var="pill" items="${searchResult}">
        <tr>
            <td>${pill.name}</td>
            <td>${pill.cost}</td>
        </tr>
    </c:forEach>
</table>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
