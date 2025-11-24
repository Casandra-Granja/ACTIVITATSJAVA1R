package Poo.Scheduler;

public class SchedulerSRTF extends Scheduler{

    public SchedulerSRTF(){
        super();
        setProlitica(Scheduler.POLITICA.SRJF);
    }

    public Proces getCurrentProces(){
        return getShortestRemainingProces();
    }

    public Proces getShortestRemainingProces(){
        Proces shortest = null;
        int minCicles = Integer.MAX_VALUE;
        for(int i=0; i<numProcessos; i++){
            if(procesos[i].numPendingCicles< minCicles){
                minCicles = procesos[i].numCiclesCPU;
                shortest = procesos[i];
            }
        }
        return shortest;
    }
}
