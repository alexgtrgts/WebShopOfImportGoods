<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<%--    <title>Now you're going to add new Supplier!</title>--%>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Please add the product in the form below</h1>
<br>
<br>
<%--<H1 class="h1">it is green</H1>--%>
<%--<a href="AddProduct.jsp"></a>--%>

<form action="AddProduct" method="post">
    <label for="name">Name:</label>
    <input type="text" id = "name" name="name"><br>
    <label for="type">Type:</label>
    <input type="text" id="type" name="type"><br>
    <label for="description">Description:</label>
    <input type="text" id= "description" name="description"><br>
    <label for="price">Price:</label>
    <input type="text" id= "price" name="price"><br>
    <input type="submit"><br>
    <button type="reset">Clear</button>
</form>
<%--<a href="servlet2">Servlet2</a>--%>
</body>
</html>