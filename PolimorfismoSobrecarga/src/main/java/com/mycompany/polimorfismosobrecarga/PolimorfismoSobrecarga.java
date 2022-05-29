package com.mycompany.polimorfismosobrecarga;

public class PolimorfismoSobrecarga {
    public static void main(String[] args) {
        Cachorro c=new Cachorro();
        
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        
    }
}
