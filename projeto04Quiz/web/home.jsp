<%-- 
    Document   : home
    Created on : 01/11/2018, 23:19:04
    Author     : Hillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web - 26/10</title>
    </head>
    <body>
        <h1>Quiz</h1>
        
        <%
            String usuario = (String)session.getAttribute("usuario");
            if (usuario == null){
                response.sendRedirect("login.jsp");
            }else{
        out.println("<h2>Bem Vindo ao Site de Teste!</h2>");
            }
            %>
        <h3>
            <a href="quiz.jsp">
                <button>Realizar teste</button>
            </a>
            
            
           <br/><br/> <a href="deslogar.jsp">
                <button>Sair da conta</button>
            </a>
        </h3>
    </body>
</html>
