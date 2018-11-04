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
    </head>
    <body>
        <h1>Hello World!</h1>
        <%if (request.getParameter("enviar_quiz") != null){
            int cont = 0;
            for (Questão q: DbQuiz.getTeste()){
                String respostaUsuario = request.getParameter(q.getQuestão());
                if (respostaUsuario.equals(q.getResposta())){
                    cont++;
                }
            }%>
        <hr><hr>
        <h1>
            Pontuação: <%= 100*((double)(cont)/10.0)  %>
        </h1>        
        <% } %>
        <h2>Quiz</h2>
        <form>
            <% for(Questão q: DbQuiz.getTeste()){ %>
                <h3>Questão: <%= q.getQuestão() %></h3>
                <% for(int i = 0; i< q.getAlternativa().length; i++) {%>
                <input type="radio" name="<%= q.getQuestão()%>" value="<%= q.getAlternativa()[i]%>">
                <%= q.getAlternativa()[i] %>
                <% } %>
                <hr>
            <% } %>
            <input type="submit" name="enviar_quiz" value="Enviar"> 
            <a href="home.jsp" role="button" >Voltar</a>
        </form>
    </body>
</html>
