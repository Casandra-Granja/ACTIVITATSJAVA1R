package Poo.Poligons;

import processing.core.PApplet;

public class MainPentagon extends PApplet {

    Pentagon p; //Declaració

    public static void main(String[] args) {

        PApplet.main("Poo.Poligons.MainPentagon");
    }

        public void settings(){
            size(800,800);

        }
        public void setup(){
        p = new Pentagon( new Punt2D("0", 0,0),200);
       


        }
        public void draw(){
        background(255);
        line(-width/2, 0, width, 0);
        line(0,-height, 0, height);
        translate(width/2,height/2);
        p.display(this);

        }
}
