<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:ui="http://java.sun.com/jsf/facelets"
    xmlns:h="http://java.sun.com/jsf/html">

<head>
<title>List of users</title>
</head>
<body>
    <h1>Our users are:</h1>
    <ui:repeat value="#{listUsersAction.userList}" var="listusers">
        <h:outputText value="#{listusers}" />
        <br/>
    </ui:repeat>
</body>
</html>
