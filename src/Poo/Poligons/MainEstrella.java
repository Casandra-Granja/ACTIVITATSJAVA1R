package Poo.Poligons;

import processing.core.PApplet;

public class MainEstrella extends PApplet {

    Estrella e; //Declaració
    Punt2D ce;

    public static void main(String[] args) {

        PApplet.main("Poo.Poligons.MainEstrella");
    }

        public void settings(){
            size(800,800);

        }
        public void setup(){
        ce= new Punt2D("0", 0,0);
        e = new Estrella(ce ,200,300);
       


        }
        public void draw(){
        background(255);
        line(-width/2, 0, width, 0);
        line(0,-height, 0, height);
        translate(width/2,height/2);
        e.display(this);

        float rInt = map(mouseX,0,width,100, 250);
        e.setRadiInterior(rInt);
        e.updatePuntsInteriors(ce);

        }
}
