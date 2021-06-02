<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add pill</title>
</head>
<body>
<style>
    <%@include file="css/addPillsPageStyle.css"%>
    <%@include file="css/buttonsStyle.css"%>
</style>

<div id="addPageDiv" >
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

    <input type="submit" value="ADD" id="addButton"/>
</form:form>

<form:form>
<input type="submit" formaction="/searchPills" value="SEARCH" id="searchButton"/>
<input type="submit" formaction="/" value="MAIN"id="mainButton"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</div>
</body>
</html>
