package com.mycompany.relacionamentoentreclasses;

public class RelacionamentoEntreClasses {
    public static void main(String[] args) {
        Lutador l[]=new Lutador[6];
        l[0]=new Lutador("Matt", "Brazil", 22, 1.80f, 60f, 10, 0, 1);
        l[1]=new Lutador("Mat", "USA", 23, 1.83f, 99f, 12, 1, 2);
        l[2]=new Lutador("Mateus", "Japan", 25, 1.72f, 56.4f, 3, 3, 3);
        l[3]=new Lutador("Augusto", "Swiss", 28, 1.81f, 82f, 5, 1, 2);
        l[4]=new Lutador("Teus", "Deutsch", 33, 1.81f, 136f, 5, 1, 2);
        l[5]=new Lutador("Teteu", "France", 36, 1.83f, 86f, 5, 1, 2);
        
        Luta uec1=new Luta();
        uec1.marcarLuta(l[0], l[2]);
        uec1.lutar();
        
        l[0].status();
        l[2].status();
    }
}
