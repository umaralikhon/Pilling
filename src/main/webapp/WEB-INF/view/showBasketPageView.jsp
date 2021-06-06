<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="var" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Basket</title>
</head>
<body>
<style>
    <%@include file="css/basketPageStyle.css"%>
    <%@include file="css/buttonsStyle.css"%>
</style>
<div id="basketPage">
    <center>
        <div id="basketTableArea">
            <table>
                <tr>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>Amount</th>
                </tr>

                <c:forEach var="pill" items="${allPillsInTheBasket}">
                    <tr>
                        <td>${pill.name}</td>
                        <td>${pill.cost}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </center>
    <br>

    <div id="secondPartOfBasketPage">
        <div id="sumArea">
            <center>
                <h3>
                    Sum: ${sum}
                </h3>
                <c:url var="clearButton" value="/clearBasket"/>
                <input type="button" value="CLEAR" onclick="window.location.href='${clearButton}'" id="clearButton"/>
            </center>
        </div>
    </div>
    <br><br>

    <div id="basketPageButtons">
        <center>
            <form:form>
                <input type="submit" formaction="/" value="MAIN" id="mainButtonInBasketPage"/>
                <input type="submit" formaction="/addPills" value="ADD" id="addButtonInBasketPage"/>
                <input type="submit" formaction="/searchPills" value="SEARCH" id="searchButtonInBasketPage"/>
            </form:form>
        </center>
    </div>
    <br><br><br>

    <h3>
        &copy; Author <a href="mailto: umaralikhon@ya.ru">Umaralikhon Kayumov</a>
    </h3>
</div>
</body>
</html>
