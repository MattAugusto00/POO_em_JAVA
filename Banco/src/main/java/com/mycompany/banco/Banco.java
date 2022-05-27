package com.mycompany.banco;

public class Banco {
    public static void main(String[] args) {
        Conta c1=new Conta(1, "cc", "Matt");
        c1.abrirConta(c1.getTipo());
        c1.estadoAtual();
        
        Conta c2=new Conta(2, "cp", "Mateus");
        c2.abrirConta(c2.getTipo());
        c2.estadoAtual();
        
        Conta c3=new Conta(3, "cp", "Augusto");
        c3.abrirConta(c3.getTipo());
        c3.sacar(25);
        c3.estadoAtual();
    }
}
