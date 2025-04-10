package Poo.Persones;

public class Jugador extends Persona{

    int gols;
    enum POSICIO{DEVANTER, MIG, DEFENSA, PORTER};
    String nomEquip;
    POSICIO posicio;

    Jugador(String n, int e, SEXE s, int g, POSICIO p, String ne){
        super(s,e, n);
        this.gols= g;
        this.posicio= p;
        this.nomEquip= ne;
    }

    //Getter

    public int getGol() {
        return gols;
    }

    public String getNomEquip() {
        return nomEquip;
    }

    public POSICIO getPosicio() {
        return posicio;
    }

    //Setter


    public void setGol(int gol) {
        this.gols = gol;
    }

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    public void setPosicio(POSICIO posicio) {
        this.posicio = posicio;
    }
    //Altres

    public void print(){
        System.out.printf("%s, juga a %s, es %s, ha marcat %d gols. %n",nom,nomEquip,posicio,gols);
    }
}
