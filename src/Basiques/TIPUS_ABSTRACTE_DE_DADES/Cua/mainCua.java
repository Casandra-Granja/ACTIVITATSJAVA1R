package Basiques.TIPUS_ABSTRACTE_DE_DADES.Cua;

import processing.core.PApplet;

public class mainCua extends PApplet {

    Cua c;
    int lastIn = -1;
    int lastOut = -1;

    public static void main(String[] args) {
        PApplet.main("Basiques.TIPUS_ABSTRACTE_DE_DADES.mainCua");
    }

    public void settings() {
        size(1600, 800);

    }

    public void setup() {
        c = new Cua();

    }

    public void draw() {
        background(100, 255, 100);
        c.display(this, 100, 200);

        textSize(54);
        textAlign(LEFT);
        text("CUA (QUEUE)", 100, 400);

        textSize(34);
        text("Núm. Elements: " + c.numElements(), 100, 500);
        text("Empty: " + c.isEmpty(), 100, 550);
        text("Full: " + c.isFull(), 100, 600);
        text("Last Dequeued: " + lastOut, 100, 650);
        text("Last Enqueued: " + lastIn, 100, 700);
    }

    public void keyPressed() {
        if(!c.isFull()) {
            if (key == 'a' || key == 'A') {
                lastIn = (int) random(0, 100);
                c.enqueue(lastIn);
                println("ENQUUEUE:" + lastIn);

            } else {
                println("NO ENQUUEUE, Queue is full!");
            }
        } else if(!c.isEmpty()){
            if(key =='r'|| key=='R') {
                lastOut = c.dequeue();
            }else {
            println("NO ENQUUEUE, Queue is EMPTY!");
        }

        }
    }
}