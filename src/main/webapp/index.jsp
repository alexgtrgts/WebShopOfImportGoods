<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--<fmt:setLocale value="ru_RU" scope="application"/> -->
<%--<fmt:setLocale value="${applicationScope.language}"/>--%>
<fmt:setBundle basename="MessageBundle" var="messages"/>

<!DOCTYPE html>
<html 	xmlns:p="https://primefaces.org/ui">
<head>
<title><fmt:message key="greetings" bundle="${messages}"/></title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1></h1>

<div align="center" />
<h2><fmt:message key="action" bundle="${messages}"/></h2>

<a href="AddSupplier.jsp"><fmt:message key="addASupplier" bundle="${messages}"/></a>
<p>
<a href="AddProduct.jsp"><fmt:message key="addAProduct" bundle="${messages}"/></a>
<p>
<a href="listAll"><fmt:message key="allProducts" bundle="${messages}"/></a>
<p>
<a href="listAllSuppliers"><fmt:message key="allSuppliers" bundle="${messages}"/></a>

<form>
    <select id="language" name="language" onchange="submit()">
        <option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
        <option value="ru" ${language == 'ru' ? 'selected' : ''}>Russian</option>
    </select>
</form>

</body>
</html>

