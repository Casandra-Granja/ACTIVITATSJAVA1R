package Poo.SimuladorSwapping1;

public class Memory {

    int mida;
    Process[] processos;
    int numProcessos;
    int freeAdress;

    Memory(int m){
        this.mida= m;
        processos= new Process[100];
        numProcessos= 0;
        freeAdress= 0;
    }



}
