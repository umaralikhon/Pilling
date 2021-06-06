<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search</title>
</head>
<body>
<style>
    <%@include file="css/searchPageStyle.css"%>
    <%@include file="css/buttonsStyle.css"%>

</style>

<div id="searchPageStyle">
    <center>
        <div id="searchFormArea">
            <form:form action="/searchPills" modelAttribute="searchPillsAttr">
                Enter search pill <form:input path="name"/>
                <input type="submit" value="Search"/>
            </form:form>


            <c:url var="deleteButton" value="/deletePill">
                <c:param name="pillId" value="${pill.id}"/>
            </c:url>

            <table>
                <tr>
                    <th>Name</th>
                    <th>Cost</th>
                    <th>Amount</th>
                    <th></th>
                </tr>


                <c:forEach var="pill" items="${searchResult}">
                    <c:url var="updateButton" value="/updatePill">
                        <c:param name="pillId" value="${pill.id}"/>
                    </c:url>

                    <c:url var="deleteButton" value="/deletePill">
                        <c:param name="pillId" value="${pill.id}"/>
                    </c:url>

                    <c:url var="basketButton" value="/toBasket">
                        <c:param name="pillId" value="${pill.id}"/>
                    </c:url>

                    <tr>
                        <td>${pill.name}</td>
                        <td>${pill.cost}</td>
                        <td>${pill.amount}</td>
                        <td>
                            <input type="button" value="UPDATE" onclick="window.location.href='${updateButton}'"/>
                        </td>
                        <td>
                            <input type="button" value="DELETE" onclick="window.location.href='${deleteButton}'"/>
                        </td>
                        <td>
                            <input type="button" value="TO BASKET" onclick="window.location.href='${basketButton}'"/>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br><br>

        <form:form>
            <input type="submit" formaction="/" value="MAIN" id="mainButtonInSearchPage"/>
            <input type="submit" formaction="/addPills" value="ADD" id="addButtonInSearchPage"/>
            <input type="submit" formaction="/showBasket" value="BASKET" id="basketButtonInSearchPage"/>
        </form:form>
    </center>
    <br><br><br><br><br>

    <h3>
        &copy; Author <a href="mailto: umaralikhon@ya.ru">Umaralikhon Kayumov</a>
    </h3>
</div>
</body>
</html>
