<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<br>
<br>
<table>
    <tr><th>Name</th><th>Type</th><th>Description</th><th>Price</th><th></th></tr>
    <c:forEach var="product" items="${product}">
        <tr><td>${product.name}</td>
            <td>${product.type}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>
            <form method="get">
                <input type="hidden" name="id" value="${product.id}">
                <button formaction="editProduct" type="submit" name="edit" value="${product.id}">Редактировать</button>
                <input type="hidden" name="id" value="${product.id}">
                <button formaction="deleteProduct" type="submit" name="deleteProduct" value="${product.id}">Удалить</button>
            </form>
            </td>
        </tr>
    </c:forEach>
</table>>

<%--<form action="listAll" method="get">--%>
<%--    <label for="name">Name:</label>--%>
<%--    <input type="text" id = "name" name="name"><br>--%>
<%--    <label for="address">Address:</label>--%>
<%--    <input type="text" id="address" name="address"><br>--%>
<%--    <label for="brandname">Brandname:</label>--%>
<%--    <input type="text" id= "brandname" name="brandname"><br>--%>
<%--    <input type="submit"><br>--%>
<%--    <button type="reset">Clear</button>--%>
<%--</form>--%>
</body>
</html>