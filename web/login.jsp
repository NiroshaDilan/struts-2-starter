<%--
  Created by IntelliJ IDEA.
  User: DilanFernando
  Date: 9/7/2022
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<s:form action="login">
    <s:textfield key="userId" label="Login ID"/>
    <br/>
    <s:password key="password" label="Password"/>
    <br/>
    <s:submit name="SUBMIT"/>
</s:form>
<%--<form method="post" action="tutorials/getTutorial.action">--%>
<%--    <label for="language"></label>--%>
<%--    <input id="language" name="language"> <br/>--%>
<%--    <input type="submit"> <br/>--%>
<%--</form>--%>
</body>
</html>
