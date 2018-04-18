<%-- 
    Document   : challenge05-2
    Created on : 2018/04/18, 13:28:20
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
        int type = 1;
        switch(type) {
        case 1:
        out.print("one");
        break;
        case 2:
        out.print("two");
        break;
        default:
        out.print("想定外");
        break;
    }
%>
    </body>
</html>
