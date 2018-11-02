/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

/**
 *
 * @author Hillo
 */
public class Questão {
    private String questão;
    private String resposta;
    private String alternativa[];

    public Questão(String questão, String resposta, String[] alternativa) {
        this.questão = questão;
        this.resposta = resposta;
        this.alternativa = alternativa;
    }
   
    
    public String getQuestão() {
        return questão;
    }

    public void setQuestão(String questão) {
        this.questão = questão;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String[] getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String[] alternativa) {
        this.alternativa = alternativa;
    }

    
    
}
