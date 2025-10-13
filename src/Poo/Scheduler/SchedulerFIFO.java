package Poo.Scheduler;

public class SchedulerFIFO extends Scheduler{

    public SchedulerFIFO(){
        super();
        setProlitica(POLITICA.FIFO);
    }

    public Proces getCurrentProces(){
        return procesos[0];
    }
}
