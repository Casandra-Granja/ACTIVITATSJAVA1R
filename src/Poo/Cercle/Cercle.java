package Poo.Cercle;

import Poo.Triangle2D.Punt2D;
import processing.core.PApplet;

public class Cercle {
    Punt2D centre;
    float radi;

    //Constructor


    public Cercle(float radi, Punt2D centre) {
        this.radi = radi;
        this.centre = centre;
    }

    public Cercle() {
        this.centre= new Punt2D("c",0,0);
        this.radi= 100;
    }

    //Getter

    public Punt2D getCentre() {
        return centre;
    }

    public float getRadi() {
        return radi;
    }

    //Setter

    public void setCentre(Punt2D centre) {
        this.centre = centre;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    //Altres

    public void display(PApplet p5){
        p5.fill(200,100,50,50);
        p5.circle(this.centre.getX(), this.centre.getY(),2*this.radi);
        this.centre.display(p5);

    }
}
