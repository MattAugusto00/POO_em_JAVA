package com.mycompany.projetofinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[]=new Video[3];
        v[0]=new Video("Aula 1 de POO");
        v[1]=new Video("Episodio 1 de TBBT");
        v[2]=new Video("Gol do ViniJR");
        
        Aluno a[]=new Aluno[2];
        a[0]=new Aluno("mateus.asp@email.com", "Mateus", 22, "M");
        a[1]=new Aluno("matt.asp@email.com", "Matt", 23, "M");
        
        Visualizacao visual[]=new Visualizacao[5];
        
        visual[0]=new Visualizacao(a[0], v[2]);
        visual[0].avaliar(82f);
        System.out.println(visual[0].toString());
        
        visual[1]=new Visualizacao(a[0], v[1]);
        visual[1].avaliar(82f);
        
        visual[2]=new Visualizacao(a[1], v[1]);
        visual[2].avaliar(82f);
        
        visual[3]=new Visualizacao(a[1], v[0]);
        visual[3].avaliar(82f);
        
        visual[4]=new Visualizacao(a[1], v[2]);
        visual[4].avaliar(82f);
        System.out.println(visual[4].toString());
    }
}
