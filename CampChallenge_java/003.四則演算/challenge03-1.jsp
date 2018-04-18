<%-- 
    Document   : challenge03-1
    Created on : 2018/04/18, 10:45:43
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

        final int BASE = 100;
        int num = 5;

        // 足し算
        int tasu = BASE + num;

        // 引き算
        int hiku = BASE - num;

        // 掛け算
        int kake = BASE * num;

        // 割り算
        int wari = BASE / num;


        // 剰余算
        int amari = BASE % 3;
        
        out.println(tasu);
        out.println(hiku);
        out.println(kake);
        out.println(wari);
        %>
    </body>
</html>
