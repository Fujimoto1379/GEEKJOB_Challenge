<%-- 
    Document   : challenge02-1
    Created on : 2018/04/17, 15:39:05
    Author     : Ryo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = "私の名前は";
            name += "藤本椋です。";
            
            out.print(name);
        %>
    </body>
</html>
