<%-- 
    Document   : index
    Created on : Sep 14, 2023, 9:56:29 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome jsp</title>
    </head>
    <body>
        <!--Implicit parameter-->
        <%   
        out.print("Welcome "+request.getParameter("uname"));  
  
        String driver=config.getInitParameter("dname");  
        out.print(" driver name is = "+driver);  
        %>
        <!--Implicit parameter-->
        
    </body>
</html>
