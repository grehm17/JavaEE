<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="productRepo" scope="request" class="service.ProductRepository" />
<head>
    <title>Catalog</title>
</head>
<body>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Cost</th>
            <th>Description</th>
        </tr>
        <c:forEach items = "${productRepo.getAll()}" var = "currProd">
            <tr>
                <td>${currProd.getId()}</td>
                <td>${currProd.getName()}</td>
                <td>${currProd.getCost()}</td>
                <td>${currProd.getDescription()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
