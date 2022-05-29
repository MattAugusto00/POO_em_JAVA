package com.mycompany.heranca;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando=!this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
