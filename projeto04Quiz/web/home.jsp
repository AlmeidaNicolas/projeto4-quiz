<%-- 
    Document   : home
    Created on : 01/11/2018, 23:19:04
    Author     : Hillo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="br.com.fatecpg.quiz.DbQuiz"%>
<%@page import="br.com.fatecpg.quiz.Historico"%>
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
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy | HH:mm");
            if (usuario == null){
                response.sendRedirect("login.jsp");
            }else{
        out.println("<h2>Bem Vindo ao Site de Teste!</h2>");
            }
            %>
            
            <table border="1">
                <tr>
                    <th>Usuário</th>
                    <th>Pontuação</th>
                    <th>Data</th>
                </tr>
                
                <% for(Historico h: Historico.ordenarData(DbQuiz.getHistorico())){
                    
                    //Tem-se a outra tabela apenas ao retirar o if
                    if(h.getUsuario().equals(usuario)){%>                    
                    <tr>
                        <td><%= h.getUsuario()%></td>
                        <td><%= h.getPontuacao()%></td>
                        <td><%= df.format(h.getPartida())%></td>
                    </tr>                        
                    <%}
                } %>
                
            </table>
            
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
