<%-- 
    Document   : challenge08-4
    Created on : 2018/04/24, 13:56:35
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
        // iが「100以下」になるまで繰り返す
        
        int i = 1000;
        while(i >= 100) {
        i = i / 2;
        }
        out.print(i);
        %>
    </body>
</html>
