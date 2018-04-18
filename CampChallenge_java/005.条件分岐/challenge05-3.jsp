<%-- 
    Document   : challenge05-3
    Created on : 2018/04/18, 13:40:08
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
            char moji = 'Ａ';
switch ( moji ) {
    case'Ａ':
        out.print("英語");
        break;
    case'あ':
        out.print("日本語");
        break;
}
            %>
    </body>
</html>
