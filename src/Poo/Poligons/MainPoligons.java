package Poo.Poligons;

import processing.core.PApplet;

public class MainPoligons  extends PApplet {

    Poligon t; //Declaració

    public static void main(String[] args) {

        PApplet.main("Poo.Poligons.MainPoligons");
    }

        public void settings(){
            size(800,800);

        }
        public void setup(){
        t= new Poligon(6, new Punt2D("0", 0,0),200);



        }
        public void draw(){
        background(255);
        line(-width/2, 0, width, 0);
        line(0,-height, 0, height);
        translate(width/2,height/2);
        t.display(this);

        }
}
