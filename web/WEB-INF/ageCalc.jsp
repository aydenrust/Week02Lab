<%-- 
    Document   : ageCalc
    Created on : Sep 12, 2019, 4:18:23 PM
    Author     : 795347
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age:<input type="text" name="age"><br>
              <input type="submit" value="Age next birthday">
        </form>
        Your age at your next birthday will be ${age} <br>
              <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
