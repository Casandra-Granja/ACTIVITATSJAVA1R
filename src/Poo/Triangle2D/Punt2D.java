package Poo.Triangle2D;

import processing.core.PApplet;
import processing.core.PConstants;

public class Punt2D {

    //Atributs, propietats o variables de clase
    float x, y;
    String nom;

    //Constructors
    public Punt2D(){
        this.x=0;
        this.y=0;
        this.nom= "O";
    }

    public Punt2D(String nom, float x, float y){
        this.nom= nom;
        this.x= x;
        this.y= y;
    }

    //Setters (Mutadores)

    void setNom(String nom){ this.nom= nom; }
    void setX(float x){ this.x= x; }
    void Sety(float y){ this.y= y; }

    void SetXY(float x, float y){ this.x= x; this.y=y;}

    //Getters (Accesores)

    public String getNom(){ return this.nom; }
    public float getX(){ return this.x; }
    public float getY() { return this.y; }

    //Altres

    public void display(PApplet p5){
        p5.fill(255,0,0);
        p5.circle(this.x,this.y,30);
        p5.text(this.nom,x+30,this.y);

    }
}
