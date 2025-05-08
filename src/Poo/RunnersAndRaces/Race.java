package Poo.RunnersAndRaces;

public class Race {
    private String raceID;
    private Runner[] runners;
    private float[] times;
    private  boolean isFinals;
    private int numRunners;
    private float classificationTime;

    //Constructor

    public Race(String raceID){
        this.raceID = raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
        this.numRunners =0;
        this.isFinals = false;
        this.classificationTime = 0;
    }
    public Race(String raceID, boolean finals, float calssificationTime){
        this.numRunners= 0;
        this.raceID=raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
        this.classificationTime= calssificationTime;
        this.isFinals= finals;

    }
    //Setter

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public void setRunners(Runner[] runners) {
        this.runners = runners;
    }

    public void setTimes(float[] times) {
        this.times = times;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }
    //Getter


    public String getRaceID() {
        return raceID;
    }

    public Runner[] getRunners() {
        return runners;
    }

    public float[] getTimes() {
        return times;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }
    public void addRunner(Runner r) {
        if(numRunners<runners.length) {
            runners[numRunners] = r;
            numRunners++;
        }
        else {
            System.out.println("Màxim esgotat de runners en una carrera.");
        }
    }

    public void addTimeToRunner(Runner r, float time) {
        for(int i=0; i<8; i++) {
            if(runners[i]== r) {
                times[i]= time;
            }
        }
    }

    public float bestTime(){
        float minTime = Float.MAX_VALUE;
        for(int i=0; i<numRunners; i++){
            if(times[i]<minTime){
                minTime = times[i];
            }
        }
        return minTime;

    }
    public String bestRunner(){
        float minTime = Float.MAX_VALUE;
        int index = -1;
        for(int i=0; i<numRunners; i++){
            if(times[i]<minTime){
                minTime = times[i];
                index = i;
            }
        }
        return runners[index].getName();
    }
    public float averageTimes(){
        if(numRunners == 0){
            return 0;
        }
        else {
            float sumTimes = 0;
            for (int i = 0; i < numRunners; i++) {
                sumTimes += times[i];
            }
            return sumTimes / numRunners;
        }
    }
    public float differenceBestFromWorst(){
        float bestTime = Float.MAX_VALUE;
        float worstTime = Float.MIN_VALUE;
        for(int i=0; i<numRunners; i++){
            float time = times[i];
            if(bestTime > time){
                bestTime = time;
            }
            if(worstTime < time){
                worstTime = time;
            }
        }
        return worstTime - bestTime;
    }
}
