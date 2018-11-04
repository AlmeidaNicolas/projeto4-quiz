/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;

/**
 *
 * @author Hillo
 */
public class DbQuiz {
    public static ArrayList <Questão> getTeste(){
        ArrayList<Questão> teste = new ArrayList<>();
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        teste.add(new Questão("", "", new String[] {"", "", ""}));
        return teste;
    }
}
