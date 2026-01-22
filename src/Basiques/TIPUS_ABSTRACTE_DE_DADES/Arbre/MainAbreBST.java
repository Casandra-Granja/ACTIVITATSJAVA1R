package Basiques.TIPUS_ABSTRACTE_DE_DADES.Arbre;

import processing.core.PApplet;

public class MainAbreBST extends PApplet {

    AbreBST abreBST;
    int valorMaxim, valorMinim, valorCerca;
    boolean resultatCerca;

    public static void main(String[] args) {
        PApplet.main("Basiques.TIPUS_ABSTRACTE_DE_DADES.Arbre.MainAbreBST");
    }

    public void settings(){
        size(1400,800);
    }

    public void setup(){
        abreBST = new AbreBST();
        for(int t=0; t<10; t++){
            int nr= (int)random(0, 100);
            abreBST.addElement(nr);
        }
        valorMaxim = abreBST.getMaxim();
        valorMinim = abreBST.getMinim();
        valorCerca= (int) random(0,100);
        resultatCerca = abreBST.cercaElement(valorCerca, abreBST.arrel);

    }
    public void draw(){
        background(255);
        abreBST.display(this, abreBST.arrel, width/2, 100, 50,0);

        fill(0); textSize(18); textAlign(LEFT);
        text("Maxim " + valorMaxim, 100, 140);
        text("Minim " + valorMinim, 100, 160);
        text("Cerca " + valorCerca + " Resultat, " + resultatCerca, 100, 180);

    }

    public void keyPressed(){
        if(key == 'a'|| key== 'A') {
            abreBST = new AbreBST();
            for (int t = 0; t < 10; t++) {
                int nr = (int) random(0, 100);
                abreBST.addElement(nr);
            }
            valorMaxim = abreBST.getMaxim();
            valorMinim = abreBST.getMinim();

        }
        if( key=='c'|| key == 'C'){
            valorCerca= (int) random(0,100);
            resultatCerca = abreBST.cercaElement(valorCerca, abreBST.arrel);

        }
    }
}

