<%-- 
    Document   : challenge08-2
    Created on : 2018/04/24, 10:27:00
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

// Aを30回表示する処理

for (int i = 1; i <= 30; i++) {
    
    out.print("A");
}

// 回数を把握するための変数：i=1（初期値は1）
// 繰り返す条件：i<=30（iが30以下の場合繰り返す）
// １回毎の増減：i++（１回毎にiに+1する）
%>
    </body>
</html>
