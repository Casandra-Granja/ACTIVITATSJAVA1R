package Poo.Scheduler;

public class SchedulerSJF extends Scheduler {

    public SchedulerSJF(){
        super();
        setProlitica(Scheduler.POLITICA.SJF);
    }

    public Proces getCurrentProces(){
        return getShortestProces();
    }

    public Proces getShortestProces(){
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcessos; i++){
            if(procesos[i].numCiclesCPU< minCicles){
                minCicles = procesos[i].numCiclesCPU;
                shortest = procesos[i];
            }
        }
        return shortest;
    }
}
