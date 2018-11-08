/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

/**
 *
 * @author NicolasAlmeida <almeidanicolas110@gmail.com>
 */
public class Historico {
    private String usuario;
    private int pontuacao;

    public Historico(String usuario, int pontuacao) {
        this.usuario = usuario;
        this.pontuacao = pontuacao;
    }    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
       
    
}
