package com.mycompany.polimorfismo;

public class Tartaruga extends Reptil{
    @Override
    public void locomover(){
        System.out.println("Caminhando lentamente...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("sla o som rsrs");
    }
}
