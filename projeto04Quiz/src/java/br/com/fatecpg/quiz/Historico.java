/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author NicolasAlmeida <almeidanicolas110@gmail.com>
 */
public class Historico {
    private String usuario;
    private int pontuacao;
    private Date partida;

    public Historico(String usuario, int pontuacao, Date partida) {
        this.usuario = usuario;
        this.pontuacao = pontuacao;
        this.partida = partida;
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

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public static ArrayList<Historico> ordenarData(ArrayList<Historico> historicos){
        Collections.sort(historicos, new Comparator<Historico>() {
            @Override
            public int compare(Historico h1, Historico h2) {
                if (h1.getPartida().after(h2.getPartida())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });    
        return historicos;
    }
    
    public static ArrayList<Historico> ordenarPontuacao(ArrayList<Historico> historicos){
        Collections.sort(historicos, new Comparator<Historico>() {
            @Override
            public int compare(Historico h1, Historico h2) {
                if (h1.getPontuacao() > h2.getPontuacao()) {
                    return -1;
                } else if (h1.getPontuacao() == h2.getPontuacao()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });    
        return historicos;
    }
}
