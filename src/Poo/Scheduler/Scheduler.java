package Poo.Scheduler;

import processing.core.PApplet;

public class Scheduler {

    enum POLITICA{FIFO, SJF, SRJF, RR};

    POLITICA politica;
    String log;
    Proces[] procesos;
    int numProcessos;
    int numCicles;

    //Constructor
    public Scheduler(){
        procesos= new Proces[10];
        this.numProcessos= 0;
        this.numCicles= 0;
        this.log= "";
        this.politica= POLITICA.FIFO;

    }

    public void setProlitica(POLITICA politica){

    }

     public Proces getCurrentProces(){

        return null;
    }

    public void display(PApplet p5, float x, float y, float s){
        p5.pushStyle();

        // Política del planificador
        p5.fill(0); p5.textSize(24); p5.textAlign(p5.LEFT);
        p5.text("Scheduler " + this.politica, x, y);

        // Estadístiques del planificador
        p5.textSize(18);
        p5.text("Num Procesos: "+ numProcessos, x, y + 40);
        p5.text("Num Cicles: "+ numCicles, x, y + 60);

        // Dibuixa els processos de la cua del planificador
        for(int i=0; i<numProcessos; i++){
            procesos[i].display(p5, x + 200 + i*(s+5), y + 40, s, s);
        }

        // Historial d'execucions de procesos
        p5.fill(0);
        p5.text(log, x, y + 140);
        p5.popStyle();

    }

    public void updateLog(Proces current){
        log += "Cycle "+ numCicles + ": running " + current.nom + "\n";
    }

    public void enterProces(Proces p){
        if(numProcessos< procesos.length-1){
            procesos[numProcessos]= p;
            numProcessos++;
        }

    }

    public void exitProces(Proces p){
        int indexCurrent = getIndexProces(p);
        for(int i= indexCurrent; i<numProcessos; i++){
            procesos[i] = procesos[i+1];
        }
        numProcessos--;
    }
    public void run(){
        Proces current = getCurrentProces();
        if(current!=null) {
            current.run();
            updateLog(current);
            if(current.estat == Proces.ESTAT.FINISHED){
                exitProces(current);
            }
        }
        numCicles++;
    }

    public int getIndexProces(Proces p){
        for(int i=0; i<numProcessos; i++){
            if(procesos[i]==p){
                return  i;
            }
        }
        return  -1;
    }




}
