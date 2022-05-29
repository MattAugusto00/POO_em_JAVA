package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4=new Funcionario();
        
        p1.setNome("Mateus");
        p2.setNome("Matt");
        p3.setNome("Augusto");
        p4.setNome("Teteu");

        p2.setIdade(22);
        p2.setSexo("M");
        
        p2.setCurso("Ciência da Computação");
        p3.setSalario(3500.50f);
        p4.setSetor("Estoque");
        p3.receberAumento(200f);
        
        System.out.println(p2.toString());
    }
}
