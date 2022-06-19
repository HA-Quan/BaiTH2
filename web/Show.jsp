<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Index Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
        <body>
            <h1> CD List </h1>
            <form action="cart" method="post">
            <table  cellpadding="5" border=1>
                <tr>
                    <th>Code</th>
                    <th>Description</th>
                    <th>Price</th>
                </tr>
            <c:forEach var="cart" items="${listCart}">
                <tr>
                    <td><c:out value="${cart.getCode()}"> </c:out> </td>
                    <td><c:out value="${cart.getDes()}"> </c:out> </td>
                    <td><c:out value="$ ${cart.getPrice()}"> </c:out> </td>
                    <td><a href="/BaiTH2/edit?code=${cart.getCode()}">edit</a></td>
                    <td><a href="/BaiTH2/delete?code=${cart.getCode()}">delete</a></td>
                </tr>
            </c:forEach>
        
        </table>
            <br>
            <br>
            <input class="button-a" type="submit" value="Add Product" />
<!--            <div class="button-view"><a href="/BaiTH2/add">Add Product</a></div>-->
            </form>
    </body>
</html>
