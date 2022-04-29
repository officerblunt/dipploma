<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div>
    <table>
        <thead>
        <th>ID</th>
        <th>Адрес</th>
        <th>Имя клиента</th>
        <th>Количество мест</th>
        <th>Организация</th>
        <th>Телефон</th>
        <th>Тип</th>
        <th>Дата</th>
        <th>Время</th>
        <th>Вес</th>
        <th>Отметки</th>

        </thead>
        <c:forEach items="${read}" var="delivery">
            <tr>
                <td>${delivery.id}</td>
                <td>${delivery.address}</td>
                <td>${delivery.client_name}</td>
                <td>${delivery.amountOfSpaces}</td>
                <td>${delivery.organisation}</td>
                <td>${delivery.phone}</td>
                <td>${delivery.type}</td>
                <td>${delivery.date}</td>
                <td>${delivery.time}</td>
                <td>${delivery.weight}</td>
                <td>${delivery.marks}</td>
                <td>
                    <form action="${pageContext.request.contextPath}/admin" method="post">
                        <input type="hidden" name="userId" value="${delivery.id}"/>
                        <input type="hidden" name="action" value="Удалить"/>
                        <button type="submit">Delete</button>
                    </form>

                </td>

            </tr>
        </c:forEach>
    </table>
    <a href="/">Главная</a>
</div>
</body>
</html>