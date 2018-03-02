<%-- 
    Document   : TableBell
    Created on : 2 Mar, 2018, 4:05:10 PM
    Author     : Elliot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
        if(request.getParameter("buttonName") != null) {
               session.setAttribute("status", "guest");
        }
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form NAME="form1" METHOD="POST">
            <INPUT TYPE="BUTTON" NAME="buttonName">
             <INPUT TYPE="BUTTON" VALUE="Call for waiter!" ONCLICK="button1()">
            
        </form>
    </body>
    
    <SCRIPT LANGUAGE="JavaScript">
        <!--
        function button1()
        {
            document.form1.buttonName.value = "yes";
            form1.submit();
        } 
        // --> 
    </SCRIPT>
</html>
