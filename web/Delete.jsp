<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Delete Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1> Are you sure you want to delete this product? </h1>
        
        <form action="delete" method="post">
            <div style="display: flex;">
                <div style="display: flex; flex-direction: column; align-content: flex-end; align-items: flex-end;">
                    <label>Product Code: </label>
                    <label>Product Description: </label>
                    <label>Product Price: </label>
                </div>
                <div style="display: flex; flex-direction: column;">
                    <label> ${cart.getCode()}</label>
                    <label> ${cart.getDes()}</label>
                    <label> ${cart.getPrice()}</label>
                </div>
            </div>
            <label>&nbsp;</label>
            <br>
            <input type="hidden" name="code" value=${cart.getCode()}>
            <input class="button-b" type="submit" value="Yes" />
            <div class="button-b"><a href="/BaiTH2/show" style="text-decoration: none; color:black;" >No</a></div>

        </form>
    </body>

</html>
