<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Общее помещение</title>
</head>
<body>

    <h1>Это общее помещение, доступно для всех</h1>
    <br>
    <br>
    <security:authorize access="hasRole('IT')">
    <input type="button" value="серверная комната"
           onclick="window.location.href = 'it'">
    помещение IT персонала
    </security:authorize>
    <br>
    <br>
    <security:authorize access="hasRole('Security')">
    <input type="button" value="комната охраны"
           onclick="window.location.href = 'security'">
    помещение службы безопасности
    </security:authorize>
    <br>
    <br>
    <security:authorize access="hasRole('Director')">
    <input type="button" value="кабинет директора"
           onclick="window.location.href = 'director'">
    помещение руководителя
    </security:authorize>

</body>
</html>
