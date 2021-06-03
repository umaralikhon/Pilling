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
    <%@include file="css/formsStyle.css"%>
</style>

<div id="addPageStyle" >
<h2>Add information about pills</h2>

<form:form action="/savePills" modelAttribute="pills">
    <div id="formArea">
    <div id="nameInput">
    Name <form:input path="name"/>
        <form:errors path="name"/>
    </div>
    <br><br>
    <div id="costInput">
    Cost <form:input path="cost"/>
        <form:errors path="cost"/>
    </div>
    <br><br>
    <div id="amountInput">
        Amount<form:input path="amount"/>
        <form:errors path="amount"/>
    </div>
    </div>
        <br><br>
<center>
    <input type="submit" value="ADD" id="addButtonInAddPage"/>
</center>
</form:form>

    <center>
<form:form>
<input type="submit" formaction="/searchPills" value="SEARCH" id="searchButton"/>
<input type="submit" formaction="/" value="MAIN" id="mainButton"/>
</form:form>
    </center>

</div>
</body>
</html>
