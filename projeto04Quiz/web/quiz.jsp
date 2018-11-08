<%-- 
    Document   : quiz
    Created on : 01/11/2018, 23:19:19
    Author     : Hillo
--%>

<%@page import="br.com.fatecpg.quiz.DbQuiz"%>
<%@page import="br.com.fatecpg.quiz.Questão"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    <a href="deslogar.jsp">
                <button>Sair da conta</button>
        </a>
    </head>
    <body>
        <%  int roda = 0;
            if (request.getParameter("enviar_quiz") != null){
            int cont = 0;
            for (Questão q: DbQuiz.getTeste()){
                String respostaUsuario = request.getParameter(q.getQuestão());
                if (respostaUsuario != null){
                    if (respostaUsuario.equals(q.getResposta())){
                        cont+=10;
                    }
                }
            }%>
        <hr>
            <h1>
                Pontuação: <%= cont %>/<%= cont*2 %>
            </h1>
        <hr>        
        <% } %>
        <h2>Quiz</h2>
        <form>
            <%  roda = 0;
                for(Questão q: DbQuiz.getTeste()){ %>
                <% if (roda++ < 10){ %>
                <h3>Questão <%= roda %>: <%= q.getQuestão() %></h3>
                <% for(int i = 0; i< q.getAlternativa().length; i++) {%>
                <input type="radio" name="<%= q.getQuestão()%>" value="<%= q.getAlternativa()[i]%>" required="">
                <%= q.getAlternativa()[i] %>
                
                <% } %>
                <hr> 
                <% } %>
            <% } %>
            <input type="submit" name="enviar_quiz" value="Enviar"> 
            <a href="home.jsp" role="button" >Voltar</a>
        </form>
    </body>
</html>
