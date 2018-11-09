/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author Hillo
 */
public class DbQuiz {
    
    public static final ArrayList<Historico> hist = new ArrayList<>();
    public static ArrayList<Historico> getHistorico(){
        Calendar data = Calendar.getInstance();
        if(hist.isEmpty()){
            data.set(2018, 11, 8, 16, 19);
            hist.add(new Historico("reginaldo", 100, data.getTime()));
            data.set(2017, 10, 5, 10, 00);
            hist.add(new Historico("machado", 30, data.getTime()));
            data.set(2018, 9, 3, 19, 19);
            hist.add(new Historico("maria", 10, data.getTime()));
            data.set(2018, 7, 28, 23, 55);
            hist.add(new Historico("lucas", 50, data.getTime()));
            data.set(2016, 5, 29, 14, 29);
            hist.add(new Historico("timoteo", 90, data.getTime()));
            data.set(2010, 11, 8, 16, 19);
            hist.add(new Historico("anderson", 80, data.getTime()));
            data.set(2018, 1, 31, 00, 10);
            hist.add(new Historico("wesker", 60, data.getTime()));
            data.set(2018, 2, 26, 15, 20);
            hist.add(new Historico("geralt", 40, data.getTime()));
            data.set(2018, 4, 30, 12, 00);
            hist.add(new Historico("mateus", 100, data.getTime()));
            data.set(2018, 3, 20, 9, 30);
            hist.add(new Historico("carlos", 30, data.getTime()));
        }
        
        return hist;
    }
    
    
    public static final ArrayList<Usuário> usuario = new ArrayList<>();        
    public static ArrayList<Usuário> getNomeUsuario(){
        if(usuario.isEmpty()){
            usuario.add(new Usuário("reginaldo", "123"));
            usuario.add(new Usuário("machado", "123"));
            usuario.add(new Usuário("maria", "123"));
            usuario.add(new Usuário("lucas", "123"));
            usuario.add(new Usuário("timoteo", "123"));
            usuario.add(new Usuário("anderson", "123"));
            usuario.add(new Usuário("wesker", "123"));
            usuario.add(new Usuário("geralt", "123"));
            usuario.add(new Usuário("mateus", "123"));
            usuario.add(new Usuário("carlos", "123"
            ));
                
        }
        return usuario;
    }
    
    public static ArrayList <Questão> getTeste(){
        ArrayList<Questão> teste = new ArrayList<>();
        teste.add(new Questão("Normalmente, quantos litros de sangue uma pessoa tem?", 
                "Tem entre 4 a 6 litros", 
                new String[]{"Tem entre 2 a 4 litros","Tem entre 4 a 6 litros","Tem 10 litros"}));
        
        teste.add(new Questão("De quem é a famosa frase “Penso, logo existo”?", 
                "Descartes", new String[]{"Sócrates","Platão","Descartes"}));
        
        teste.add(new Questão("De onde é a invenção do chuveiro elétrico?",
                "Brasil", new String[]{"Brasil","Inglaterra","Itália"}));
        
        teste.add(new Questão("Qual o nome do presidente do Brasil que ficou conhecido como Jango?",
                "João Goulart", new String[]{" Jânio Quadros","Getúlio Vargas"," João Goulart"}));
        
        teste.add(new Questão("Quais os países que têm a maior e a menor expectativa de vida do mundo?",
                "Japão e Serra Leoa", new String[]{"Japão e Serra Leoa","Estados Unidos e Angola",
                    "Itália e Congo"}));
        
        teste.add(new Questão("Quanto tempo a luz do Sol demora para chegar à Terra?",
                "8 minutos", new String[]{"12 minutos","8 minutos","segundos"}));
        
        teste.add(new Questão("Qual a nacionalidade de Che Guevara?",
                "Argentina", new String[]{"Cubana","Boliviana","Argentina"}));
        
        teste.add(new Questão("Em que período da pré-história o fogo foi descoberto?",
                "Paleolítico", new String[]{"Paleolítico","Neolítico","Período da Pedra Polida"}));
        
        teste.add(new Questão("Qual a montanha mais alta do Brasil?",
                "Pico da Neblina", new String[]{"Monte Roraima","Pico da Bandeira","Pico da Neblina"}));
        
        teste.add(new Questão("Qual a velocidade da luz?",
                "299 792 458 metros por segundo (m/s).",
                new String[]{"299 792 458 metros por segundo (m/s).",
                    "300 000 000 metros por segundo (m/s)","199 792 458 metros por segundo (m/s)"}));
        
        teste.add(new Questão("Qual o maior animal terrestre?",
                "Elefante africnao", new String[]{"Baleia azul","Tubarão branco","Elefante africano",}));
        
        teste.add(new Questão("As pessoas de qual tipo sanguíneo são consideradas doadores universais?",
                "Tipo O", new String[]{"Tipo OA","Tipo O","Tipo AB"}));
        
        teste.add(new Questão("Qual o nome do cientista que descobriu o processo de pasteurização e a vacina contra a raiva?",
                "Louis Pasteurs", new String[]{"Marie Curie","Louis Pasteurs","Charles Darwin"}));
        
        teste.add(new Questão("Qual foi o ano em que o primeiro homem pisou na Lua?",
                "1969", new String[]{"1961","1969","1971"}));
        
        teste.add(new Questão("Júpiter e Plutão são os correlatos romanos de quais deuses gregos?",
                "Zeus e Hades", new String[]{"Zeus e Hades","Ares e Hermes","Zeus e Ares"}));
        
        teste.add(new Questão("Quem é o autor de “O Príncipe”?",
                "Maquiavel", new String[]{"Rosseau","Montesquieu","Maquiavel"}));
        
        teste.add(new Questão("Em qual local da Ásia o português é língua oficial?",
                "Macau", new String[]{"Índia","Macau","Filipinas","4"}));
        
        teste.add(new Questão("Qual das alternativas abaixo apenas contêm classes de palavras?",
                "Substantivo, verbo e preposição",
                new String[]{"Substantivo, verbo e preposição","Hiatos, ditongos e tritongos",
                    "Fonologia, Morfologia e Sintaxe"}));
        
        teste.add(new Questão("Quem pintou 'Guernica'?",
                "Pablo Picasso", new String[]{"Pablo Picasso","Salvador Dalí","Tarsila do Amaral"}));
        
        teste.add(new Questão("Qual o número mínimo de jogadores numa partida de futebol?",
                "7", new String[]{"8","10","7"}));
        
        teste.add(new Questão("Qual o livro mais vendido no mundo a seguir à Bíblia?",
                "Dom Quixote", new String[]{"Dom Quixote","Senhor dos Anéis","O Pequeno Príncipe"}));
        
        teste.add(new Questão("Que líder mundial ficou conhecida como “Dama de Ferro”?",
                "Margaret Thatcher", new String[]{"Christine Lagerde","Margaret Thatcher","Angela Merkel"}));
        
        teste.add(new Questão(" Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?",
                "Igualdade das raças", new String[]{"Luta contra o Apartheid","Justiça para os menos favorecidos",
                    "Igualdade das raças"}));
        
        teste.add(new Questão(" Em que ano e onde aconteceu o maior acidente aéreo da história do Brasil?",
                "Ano 2007, em São Paulo", new String[]{"Ano 2007, em São Paulo","Ano 1996, em São Paulo",
                    "Ano 1982, no Ceará"}));
        
        teste.add(new Questão("Quais os quatros países que têm a maior população carcerária do mundo?",
                "Estados Unidos, China, Rússia e Brasil",
                new String[]{"Brasil, Estados Unidos, México e Índia","China, Estados Unidos, Índia e Indonésia",
                    "Estados Unidos, China, Rússia e Brasil"}));
        
        teste.add(new Questão("Quais os países que mais têm recebido refugiados sírios?",
                "Turquia e Líbano", new String[]{"Turquia e Líbano","Alemanha e França","Iraque e Suécia"}));
        
        teste.add(new Questão("Durante quantos anos Fidel Castro, um dos governantes que esteve mais tempo no poder, esteve à frente de Cuba?",
                "49 anos", new String[]{"32 anos","49 anos","46 anos"}));
        
        teste.add(new Questão("Qual o nome do líder da Coreia do Norte?",
                "Kim Jong-un", new String[]{"Pak Pong-ju","Kim Jong-Il","Kim Jong-un"}));
        
        teste.add(new Questão("O que é Brexit?", "Saída do Reino Unido da União Europeia",
                new String[]{"Saída do Reino Unido da União Europeia","Saída do Reino Unido da Zona Euro",
                    "Mudança do sistema de governo no Reino Unido"}));
        teste.add(new Questão("Eva Braun era o nome da esposa de qual dessas personalidades conhecidas pela sua crueldade?",
                "Adolf Hitler", new String[]{"Josef Stalin","Benito Mussolini","Adolf Hitler"}));
        
        Collections.shuffle(teste);        
        
        return teste;
    }
    
}
