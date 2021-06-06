<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<title>
    Pilling
</title>
<body>
<style>
    <%@include file="css/addPillsPageStyle.css"%>
    <%@include file="css/buttonsStyle.css"%>
    <%@include file="css/mainPageStyle.css"%>
</style>

<div id="mainPage">
    <center>
        <h1>Welcome to Pilling</h1>

        <div id="buttonsArea">
            <h2>Please choose the operation</h2>

            <form:form>
                <input type="submit" value="Add" formaction="/addPills" id="addButton"/>
                <input type="submit" value="Search" formaction="/searchPills" id="searchButton"/>
            </form:form>
        </div>
    </center>

    <!--Brrr...-->
    <br><br><br><br><br><br><br><br><br>

    <h3>
        &copy; Author <a href="mailto: umaralikhon@ya.ru">Umaralikhon Kayumov</a>
    </h3>
</div>
</body>
</html>
