package com.mycompany.relacionamentoentreclasses;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(isAprovada()){
            System.out.println("###Desafiado###");
            this.getDesafiado().apresentar();
            System.out.println("###Desafiante###");
            this.getDesafiante().apresentar();
            
            Random aleatorio=new Random();
            int vencedor=aleatorio.nextInt(3); //0,1 ou 2
            System.out.println("Resultado da luta: ");
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1://Ganhou desafiador
                    System.out.println(this.getDesafiado().getNome() + " ganhou");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2://ganhou desafiante
                    System.out.println(this.getDesafiante().getNome() + " ganhou");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("---------------------------------------");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
