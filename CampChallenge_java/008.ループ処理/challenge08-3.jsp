<%-- 
    Document   : challenge08-3
    Created on : 2018/04/24, 11:00:47
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

// 8の20乗の合計を表示する処理
int total = 0;

for (int i = 0; i <= 100; i++) {
    total = total + i;
}

out.print(total);

// 回数を把握するための変数：i=0（初期値は0）
// 繰り返す条件：i<=20（iが20以下の場合繰り返す）
// １回毎の増減：i++（１回毎にiに+1する）
%>
    </body>
</html>
