<%@ page import="entities.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<% Product prod = (Product) application.getAttribute("prod"); %>
<head>
    <title><%="Product " + prod.getId()%></title>
</head>
<body>
    <p><%="id : " + prod.getId()%></p>
    <p><%="name : " + prod.getName()%></p>
    <p><%="cost : " + prod.getCost()%></p>
    <p><%="description : " + prod.getDescription()%></p>
</body>
</html>
