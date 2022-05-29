package com.mycompany.polimorfismo;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolha...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
 
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Glub...");
    }
    
}
