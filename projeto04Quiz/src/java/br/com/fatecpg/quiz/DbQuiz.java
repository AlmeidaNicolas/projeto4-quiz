/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hillo
 */
public class DbQuiz {
    public static ArrayList <Questão> getTeste(){
        ArrayList<Questão> teste = new ArrayList<>();
        teste.add(new Questão("1", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("2", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("3", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("4", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("5", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("6", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("7", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("8", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("9", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("10", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("11", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("12", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("13", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("14", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("15", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("16", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("17", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("18", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("19", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("20", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("21", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("22", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("23", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("24", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("25", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("26", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("27", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("28", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("29", "1", new String[]{"1","2","3","4"}));
        teste.add(new Questão("30", "1", new String[]{"1","2","3","4"}));
        
        Collections.shuffle(teste);        
        
        return teste;
    }
}
