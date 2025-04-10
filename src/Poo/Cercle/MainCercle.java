package Poo.Cercle;

import Poo.Triangle2D.Punt2D;
import processing.core.PApplet;

public class MainCercle extends PApplet {
    Cercle c1, c2; //Declaració de les variables de classe Cercle

    public static void main(String[] args) {
        PApplet.main("Poo.Cercle.MainCercle");
    }


    public void settings(){
        size(800,800);
    }
    public void setup(){
        //Instanciació de les variables de classe Cercle amb els constructors
        c1= new Cercle(300, new Punt2D("A", 200,200));
        c2= new Cercle();

    }
    public void draw(){
        background(255);
        translate(width/2, height/2);

        //Dibuixar eixos
        line(-width,0,width, 0);
        line(0,- height, 0, height);


        //Dibuixa cercle
        c1.display(this);
        c2.display(this);

    }
    public void mousePressed(){

    }
}
