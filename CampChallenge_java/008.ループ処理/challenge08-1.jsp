<%-- 
    Document   : challenge08-1
    Created on : 2018/04/23, 16:44:34
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
int total = 1;

for (int i = 1; i <= 20; i++) {
    total = total * 8;
}

out.print(total);

// 回数を把握するための変数：i=1（初期値は1）
// 繰り返す条件：i<=20（iが20以下の場合繰り返す）
// １回毎の増減：i++（１回毎にiに+1する）
%>
    </body>
</html>
