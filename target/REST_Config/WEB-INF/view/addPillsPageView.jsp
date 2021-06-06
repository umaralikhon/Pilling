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

<div id="addPageStyle">
    <center><h1>Add information about pills</h1></center>

    <form:form action="/savePills" modelAttribute="pills">
        <form:hidden path="id"/> <!--Hidden ID of pill which get from search forms(searchPillsPageView)-->

        <div id="formArea">
            <div id="nameInput">
                Name <form:input path="name" size="50"/>
                <form:errors path="name"/>
            </div>
            <br><br>
            <div id="costInput">
                Cost <form:input path="cost" size="50"/>
                <form:errors path="cost" />
            </div>
            <br><br>
            <div id="amountInput">
                Amount<form:input path="amount" size="50"/>
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
            <input type="submit" formaction="/showBasket" value="BASKET" id="showBasketButton"/>
        </form:form>
    </center>

    <br><br><br>
    <h3>
        &copy; Author <a href="mailto: umaralikhon@ya.ru">Umaralikhon Kayumov</a>
    </h3>
</div>

</body>
</html>
