package com.mycompany.polimorfismo;

public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Piando...");
    }
}
