<%-- 
    Document   : challenge07-1
    Created on : 2018/04/23, 13:03:04
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
        <%@ page import="java.util.HashMap" %>
        <%@ page import="java.util.ArrayList" %>

        <%
        //ユーザー情報をHashMapにまとめ、ArrayListで管理する。
        HashMap<String,String> user1=new HashMap<String,String>();
        HashMap<String,String> user2=new HashMap<String,String>();
        HashMap<String,String> user3=new HashMap<String,String>();
        HashMap<String,String> user4=new HashMap<String,String>();
        
        //課題の情報を格納
        user1.put("1","AAA");
        user2.put("hello","world");
        user3.put("soeda","33");
        user4.put("20","20");
        
        // ユーザー情報を入れる配列
        ArrayList<HashMap> data = new ArrayList<HashMap>();
        
        // ユーザー情報格納
        data.add(user1);
        data.add(user2);
        data.add(user3);
        data.add(user4);
        
        out.print("1に"+ user1.get("1")+"，");
        out.print("helloに"+user2.get("hello")+"，");
        out.print("soedaに"+user3.get("soeda")+"，");
        out.print("20に"+user4.get("20"));

        %>
    </body>
</html>
