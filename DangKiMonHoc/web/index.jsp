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
        <title>Bai Tap Buoi 1</title>
        <style>  
body{
align-content: center; 
padding:5px;
}
h1{  
position: relative;
align-content: center;
padding-left: 70vh;
}  
.time{
    position: fixed;
    margin: 3px;
    top: 6px;
    right: 6px;
    border:5px;
    border-radius: 5px;
    background-color: goldenrod;
}
table{
    margin-left: 70vh;
    position: relative;
    border: 15px;
    border-color: black;
    border-radius: 10px;
    background-color: rgb(40,150,140);
}
td{
    margin: 15px;
}
input{
    margin: 5px;
    position: relative;
    border-radius: 5px;
    border-color: gray;
    background-color:white;
}
.im_test_1{
   
    position: relative;
    padding-left: 70vh;
}
</style>  
    </head>
    <body>
          <%
            String Error = request.getParameter("error"); 
if(Error!=null){
%>
<h1>Dang nhap that bai</h1>
        <%
            }

        %>
        <%
            String logout = request.getParameter("logout"); 
if(logout!=null){
%>
<h1>Tam biet hen gap lai lan sau</h1>
        <%
            }

        %>
        <div class='all'>
        <h1>Login Form</h1>
        <form name="login" action="./Validation" method="GET">
            <table>
            <tr>
                <td>
                    Username : 
                </td>
            
                <td>
                    <input name="username"/><!-- comment -->
                </td>
            </tr>
            <tr>
                <td>
                    Password : 
                </td>
                <td>
                    <input type = "password" name="password"/><!-- comment -->
                </td>
            </tr>
            <tr class="btn">
                <td><input type="submit"/>
                </td>
                <td>
                    <input type="reset"/>
                </td>
            </tr>
        </table>
        
        </form>
        <!--Implicit parameter-->
       
       <form action="welcome" class='im_test_1'>  
        <input type="text" name="uname">  
        <input type="submit" value="go" ><br/>  
        </form>  
        <!--Implicit parameter-->
        
        <div class="time">
             <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
        </div>
</form>  
</div>
    </body>
</html>
