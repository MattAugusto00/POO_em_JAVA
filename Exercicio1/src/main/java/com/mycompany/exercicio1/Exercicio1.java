package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Pessoa p[]=new Pessoa[2];
        Livro l[]=new Livro[3];
        
        p[0]=new Pessoa("Mateus", 22, "M");
        p[1]=new Pessoa("Augusto", 21, "M");
        
        l[0]=new Livro("JAVA", "Matt", 150, p[0]);
        l[1]=new Livro("Rocket", "Elon", 400, p[1]);
        l[2]=new Livro("CruzeiroEC", "Ronaldo", 980, p[0]);
        
        l[0].folhear(20);
        l[0].folhear(200); //manterá na pagina 20 pois o limite de paginas é 150
        System.out.println(l[0].detalhes());
    }
}
