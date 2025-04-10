package Poo.Triangle2D;

import processing.core.PApplet;

public class MainTriangle extends PApplet {
    
    Punt2D p1;
    Punt2D p2;
    Punt2D p3;
    Triangle t1;
    
    public static void main(String[] args) {
        PApplet.main("Poo.Triangle2D.MainTriangle");

    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        p1= new Punt2D();
        p2= new Punt2D("A",200,200);
        p3= new Punt2D("B", -200, 100);

        t1= new Triangle(p1,p2,p3);

    }
    public void draw(){
        background(255);
        translate(width/2, height/2);
        //p1.display(this);
        //p2.display(this);
        //p3.display(this);

        t1.display(this, color(255,100,100,50));

    }

    public void mousePressed(){
        Punt2D pMouse= new Punt2D("A",mouseX- width/2, mouseY-height/2);
        t1.setA(pMouse);
    }

    }

