<%-- 
    Document   : body
    Created on : Apr 18, 2016, 10:32:17 PM
    Author     : yixxie
    Page that dynamically generate book image, description (not complete, make changes accoreding to Item class)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="book" class="ItemPackage.Item" scope="application" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap eCommerce Template</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body> 
        <div class="container">
            <div class="row text-center">   
                <c:forEach items="<%= book.getList() %>" var="item">
                    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
                        <div class="thumbnail"> <a href="Description.html"><img src="${item}" alt="Thumbnail Image 1" class="img-responsive"></a>
                            <div class="caption">
                                <h3>Product</h3>
                                <p>Description of the book.</p>
                                <p><a href="Description.html" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Download </a> </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
