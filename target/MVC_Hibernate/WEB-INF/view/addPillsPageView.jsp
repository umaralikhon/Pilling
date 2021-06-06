<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

You are in the "Add page"<br>
<h2>Please add information about pills</h2>

<form:form action="/savePills" modelAttribute="pills">
    Name <form:input path="name"/>
        <form:errors path="name"/>
    <br><br>
    Cost <form:input path="cost"/>
        <form:errors path="cost"/>
    <br><br>
    Amount<form:input path="amount"/>
        <form:errors path="amount"/>
    <br><br>

    <input type="submit" value="ADD"/>
</form:form>

<form:form>
<input type="submit" formaction="/searchPills" value="SEARCH">
<input type="submit" formaction="/" value="MAIN"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
