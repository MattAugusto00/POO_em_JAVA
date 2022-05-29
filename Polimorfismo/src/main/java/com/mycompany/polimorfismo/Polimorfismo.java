package com.mycompany.polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Mamifero m=new Mamifero();
        Canguru c=new Canguru();
        Cachorro k=new Cachorro();
        Peixe p=new Peixe();
        
        System.out.println("-----Mamifero-----");
        m.setPeso(15.25f);
        m.setCorPelo("Cinza");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("-----Canguru-----");
        c.setPeso(25f);
        c.setCorPelo("Amarelo");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        System.out.println("-----Cachorro-----");
        k.setPeso(75f);
        k.setCorPelo("Laranja");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        System.out.println("-----Peixe-----");
        p.setPeso(1.2f);
        p.setCorEscama("Laranja");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        System.out.println("--------------------------------");
    }
}
