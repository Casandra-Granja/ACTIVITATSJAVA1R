package Poo.RunnersAndRaces;

public class Runner {
    // Propietats
    private String name;
    private String team;
    private String[] raceIDs;//puedo inicializar aquí??
    private float[] times;
    private int numRaces;
    private boolean professional;

//constructors
    public Runner(String name) {
        this.name = name;
        this.team = "Sense Equip";
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
        this.professional = false;
    }

    public Runner(String name, String team, boolean professional) {
        this.name = name;
        this.team = team;
        this.professional = professional;
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
    }

    // Getters i setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    // Altres mètodes

    public void addRace(String idRace){
        if(numRaces<5) {
            raceIDs[numRaces] = idRace;
            numRaces++;
            System.out.printf("Has afegit la carrera %s al corredor %s.\n", idRace, this.name);
        }
        else {
            System.out.println("Error! Màxim (5) de carreres corregudes pel corredor.");
        }
    }

    public void addTime(float time){
        times[numRaces] = time;//por que -1
    }

    public float bestTime(){
        float minTime = Float.MAX_VALUE;
        for(int i=0; i<numRaces; i++){
            if(times[i]<minTime){
                minTime = times[i];
            }
        }
        return minTime;
    }

    public float averageTimes(){
        float avg = 0;
        for(int i=0; i<numRaces; i++){
            avg += times[i];
        }
        return avg / numRaces;
    }

    public String bestRace() {
        if (numRaces == 0) {
            return "No hi ha cerreres.";
        } else {
            float minTime = Float.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < numRaces; i++) {
                if (times[i] < minTime) {
                    minTime = times[i];
                    index = i;
                }
            }
            return raceIDs[index];
        }
    }
}
