<%-- 
    Document   : login
    Created on : 06/11/2018, 23:14:21
    Author     : MARIA
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="br.com.fatecpg.quiz.Historico"%>
<%@page import="br.com.fatecpg.quiz.DbQuiz"%>
<%@page import="br.com.fatecpg.quiz.Usuário"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <link href="css/estilo.css" rel="stylesheet">
        <title>Login</title>        
    </head>
    <body>
        
    <form action ="login.jsp" method="post">
        Usuario:<br/> <input type="text" name="usuario"/><br/>
        Senha:<br/> <input type="password" name="senha"/><br/>
        <br/> <input type="submit" name="enviar" value="Logar" /><br/>
    </form>
        <%
        if(request.getParameter("enviar") != null){
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        boolean a = false;
        
        for(Usuário u: DbQuiz.getNomeUsuario()){
            if(u.getNome().equals(usuario) && u.getSenha().equals(senha)){
                a = true;
            }
        }
        
        if(a == true){
            session.setAttribute("usuario", usuario);
            response.sendRedirect("home.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
            }
        }
        %>
        

    </body>
</html>
