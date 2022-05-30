package com.mycompany.projetofinal;

public class Visualizacao {
    private Aluno espectador;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){ //porcentagem assistida do video
        int total=0;
        if(porc<=20){
            total=3;
        }else if(porc<=50){
            total=5;
        }else if(porc<=90){
            total=8;
        }else{
            total=10;
        }
        this.filme.setAvaliacao(total);
    }

    public Aluno getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

    
}
