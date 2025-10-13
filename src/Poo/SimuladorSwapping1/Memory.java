package Poo.SimuladorSwapping1;

import processing.core.PApplet;

public class Memory {

    int mida;
    Proces[] processos;
    int numProcessos;
    int freeAdress;

    Memory(int m) {
        this.mida = m;
        processos = new Proces[100];
        numProcessos = 0;
        freeAdress = 0;
    }

    void swapIn(Proces p) {
        if (freeAdress + p.mida < mida) {
            processos[numProcessos] = p;
            numProcessos++;
            p.setAddress(freeAdress);
            freeAdress = freeAdress + p.mida;

        } else {
            System.out.println("Error de SWAP IN del proces " + p.nom);
        }

    }

    void swapOut(Proces p) {
        for (int i = 0; i < numProcessos; i++) {
            if (processos[i] == p) {
                processos[i] = null;
                numProcessos--;
                System.out.print("SWAPPED OUT" + p.nom);

            }
        }
    }

    void display(PApplet p5) {

        p5.stroke(0);
        p5.strokeWeight(3);
        p5.fill(220);
        p5.rect(100, 100, mida, 300);

        p5.fill(0);
        p5.textSize(20);
        p5.textAlign(p5.LEFT);
        p5.text("Memòria RAM", 100, 60);

        p5.text("Total:" + mida, 100, 400);

        int mo= calculMemoriaOcupada();
        p5.text("Memòria ocupada:" + mo, 100, 540);

        int ml= mida-mo;
        p5.text("Memòria Llire:" + ml, 100, 500);

        int np = numProcessos();
        p5.text("Num Processos actius:" + np, 100, 620);


        for (int i = 0; i < processos.length; i++) {
            if (processos[i] != null) {
                processos[i].display(p5, 100, 100, 300);
            }
        }


    }

    int calculMemoriaOcupada() {
        int sum= 0;
        for(int i=0; i<processos.length; i++) {
            if (processos[i] != null) {
                sum = processos[i].mida + sum;
            }
        }
        return sum;

    }

    int numProcessos(){
        int num= 0;
        for(int i=0; i<processos.length; i++){
            if(processos[i]!= null){
                num++;
            }
        }
        return num;
    }



}
