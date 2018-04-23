<%-- 
    Document   : challenge06
    Created on : 2018/04/23, 11:15:49
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

// 10， 100， soeda， hayashi， -20， 118， ENDが入った配列を作成
String[] data = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};

// 1番目「10」を表示
out.println(data[0]);
// 2番目「100」を表示
out.println(data[1]);
// 3番目「soeda」を表示
out.println(data[2]);
// 4番目「hayashi」を表示
out.println(data[3]);
// 5番目「-20」を表示
out.println(data[4]);
// 6番目「118」を表示
out.println(data[5]);
// 7番目「END」を表示
out.println(data[6]);

        %>
    </body>
</html>
