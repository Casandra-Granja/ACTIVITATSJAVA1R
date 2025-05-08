package Poo.RunnersAndRaces;

public class Team {
    private String name;
    private Runner[] runners;
    private int numRunners;
    private boolean international;

    public Team(String name, boolean interational){
        this.numRunners= 0;
        this.name= name;
        this.international= interational;
        this.runners= new Runner[8];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public void setRunners(Runner[] runners) {
        this.runners = runners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public String getName() {
        return name;
    }

    public Runner[] getRunners() {
        return runners;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public boolean isInternational() {
        return international;
    }

    public void addRunner(Runner r){
        if(numRunners<runners.length) {
            runners[numRunners] = r;
            numRunners++;
        }
        else {
            System.out.println("Màxim esgotat de runners en un equip.");
        }
    }

    public float averageTimes(){
        if(numRunners == 0){
            return 0;
        }
        else {
            float sumTimes = 0;
            for (int i = 0; i < numRunners; i++) {
                sumTimes += runners[i].averageTimes();
            }
            return sumTimes / numRunners;
        }
    }


    public int getNumProfessionals(){
        int np = 0;
        for(int i=0; i<numRunners; i++){
            Runner ri = runners[i];
            if(ri.isProfessional()){
                np++;
            }
        }
        return np;
    }


    public boolean areAllProfessional(){
        for(int i=0; i<numRunners; i++){
            Runner ri = getRunners()[i];
            if(!ri.isProfessional()){
                return false;
            }
        }
        return true;
    }

    public boolean areAllProfessional2(){
        return getNumRunners() == getNumProfessionals();
    }
}
