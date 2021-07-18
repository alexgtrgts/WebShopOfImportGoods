<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<%--    <title>Now you're going to add new Supplier!</title>--%>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Please add the supplier in the form below</h1>
<br>
<br>


<form action="AddSupplier" method="get">
    <label for="name">Name:</label>
    <input type="text" id = "name" name="name"><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br>
    <label for="brandname">Brandname:</label>
    <input type="text" id= "brandname" name="brandname"><br>
    <input type="submit"><br>
    <button type="reset">Clear</button>
</form>
</body>
</html>