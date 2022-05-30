package com.mycompany.projetofinal;

public class Aluno extends Pessoa{
    private String login;
    private int totalAssistido;

    public Aluno(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    
    
    public String getLogin() {
        return login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
}
