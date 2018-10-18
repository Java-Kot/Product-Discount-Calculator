<%--
  Created by IntelliJ IDEA.
  User: conifer
  Date: 18/10/2018
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
    <form method="post" action="/display-discount">
        <div class="discount">
            <h2>Discount</h2>
            <input type="text" name="Description" size="100"  placeholder="Product Description" />
            <input type="number" name="ListPrice" size="30" placeholder="List Price" />
            <input type="number" name="Discount" size="30"  placeholder="Discount Percent" />
            <input type="submit" value="Calculate Discount" />
        </div>
    </form>
  </body>
</html>
