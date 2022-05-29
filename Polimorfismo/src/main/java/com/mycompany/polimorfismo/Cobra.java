package com.mycompany.polimorfismo;

public class Cobra extends Reptil{
    @Override
    public void locomover(){
        System.out.println("Rastejando...");
    }
    @Override
    public void alimentar(){
        System.out.println("Engolindo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Tsiiii...");
    }
}
