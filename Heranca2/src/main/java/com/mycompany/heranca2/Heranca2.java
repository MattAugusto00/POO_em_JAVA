package com.mycompany.heranca2;

public class Heranca2 {

    public static void main(String[] args) {
        Aluno a1=new Aluno();
        a1.setNome("Mateus");
        a1.setMatricula(201800000);
        a1.setCurso("Ciência da Computação");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1=new Bolsista();
        b1.setMatricula(123123);
        b1.setNome("Matt");
        b1.setBolsa(150.75f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1=new Tecnico();
        t1.setNome("Arrascaeta");
        t1.setMatricula(10);
        t1.setCurso("Futebol");
        t1.pagarMensalidade();
    }
}
