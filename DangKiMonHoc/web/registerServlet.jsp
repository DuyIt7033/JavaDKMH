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
        <title>Jsp page </title>
    </head>
    <body>
        <<h1>Dang ky Sevlet</h1>
        
        
        <!--Implicit parameter-->
        <%
          ViDu1 vd1 = new Vidu1();
          application.addServlet("BaiTap",vd1);
                
        <!--Implicit parameter-->
         <a href="./BaiTap">Servlet vi du 1</a>
         
                 %>
        <!--Implicit parameter-->
    </body>
</html>
