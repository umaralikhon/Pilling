<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<title>
    Pilling
</title>
<body>
<h1>Welcome to Pilling</h1><br>
<h4>Please choose operation</h4>

<form:form>
    <input type="submit" value="Add" formaction="/addPills"/>
    <input type="submit" value="Search" formaction="/searchPills"/>
</form:form>

<font color="#dc143c"> <h2>(The page is in the development!)</h2></font>
</body>
</html>
