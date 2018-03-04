<%-- 
    Document   : Bell
    Created on : 2 Mar, 2018, 8:15:01 PM
    Author     : Elliot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form name="myForm" action="/BellServlet" method="get">
            <%
        String a = request.getParameter("tableNo");
        request.setAttribute("tableNo", a);
        %>
            <input type ="submit" value="Call For Assistance" name="submit"/>
            
            
        </form>
    </body>
</html>
