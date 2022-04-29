<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>
<div>
    <form method="POST" action="/deliveriyadd">
        <h2>Добавление доставки</h2>
        <div>
            <input name="Адрес" type="text" placeholder="address"
                   autofocus="true"/>
            <input name="Имя клиента" type="text" placeholder="client_name"/>
            <input name="Количество мест" type="number" placeholder="amountOfSpaces"/>
            <input name="Организация" type="text" placeholder="organisation"/>
            <input name="Телефон" type="text" placeholder="phone"/>
            <input name="Тип" type="text" placeholder="type"/>
            <input name="Дата" type="text" placeholder="date"/>
            <input name="Время" type="text" placeholder="time"/>
            <input name="Вес" type="number" placeholder="weight"/>
            <input name="Отметки" type="text" placeholder="marks"/>
            <button type="submit">Создать</button>
        </div>
    </form>
</div>

</body>
</html>
