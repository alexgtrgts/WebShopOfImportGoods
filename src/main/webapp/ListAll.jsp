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
                <button action="editProduct" type="submit" name="edit" value="${product.id}">Редактировать</button>
                <input type="hidden" name="id" value="${product.id}">
                <button action="deleteProduct" type="submit" name="deleteProduct" value="${product.id}">Удалить</button>
            </form>
            </td>
        </tr>
    </c:forEach>
</table>>
</body>
</html>