package Poo.Geometria;

import processing.core.PApplet;

public class MainPunt2DProva extends PApplet {

    Punt2D p1, p2;

    public static void main(String[] args) {
        PApplet.main("Poo.Geometria.MainPunt2DProva");

                                //package     public class
    }

    public void settings(){
        size(800,800);
        p1= new Punt2D("A",200,200);
        p2= new Punt2D("B", 300,100);

    }

    public void setup(){

    }
    public void draw(){
        background(255);
        line(width/2, 0, width/2, height);
        line(0, height/2, width, height/2);
        translate(width/2, height/2);
        p1.display(this);
        p2.display(this);

    }

}