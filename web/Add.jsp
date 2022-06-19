<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Add Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <script src="styles/Exception.js"></script>
    </head>
    <body>
        <h1> Product </h1>
        <p style="font-style: italic; font-size: 20px;"> You must enter a description for the product. </p>
        <form name="FormInput" action="add" method="post" onsubmit="return validateForm()">
            <div style="display: flex;">
                <div style="display: flex; flex-direction: column; align-content: flex-end; align-items: flex-end;">
                    <label>Product Code:</label>
                    <label>Product Description:</label>
                    <label>Product Price:</label>
                </div>

                <div style="display: flex; flex-direction: column;">
                    <input type="text" name="pCode">
                    <input type="text" name="pDes" style="width: 30em;">
                    <input type="text" name="pPrice">
                </div>
            </div>
            <label>&nbsp;</label>
            <br>
            <input class="button-a" type="submit" value="Update Products" />
            <div class="button-a"><a href="/BaiTH2/show" style="text-decoration: none;color:black;">View Products</a></div>

        </form>
    </body>
    
</html>
