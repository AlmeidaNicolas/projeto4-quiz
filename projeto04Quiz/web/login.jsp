<%-- 
    Document   : login
    Created on : 06/11/2018, 23:14:21
    Author     : MARIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <form action ="login.jsp" method="post">
        Usuario:<br/> <input type="text" name="usuario"/><br/>
        Senha:<br/> <input type="password" name="senha"/><br/>
        <br/> <input type="submit" value="Logar" /><br/>
    </form>
        <%
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        if(usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()){
            session.setAttribute("usuario", usuario);
            response.sendRedirect("home.jsp");
        }
        %>
    </body>
</html>
