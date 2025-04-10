package Poo.Persones;

public class Persona {

    enum SEXE{HOME,DONA,ALTRE};

    String nom;
    int edat;
    SEXE sexe;

    //Constructor

    public Persona(SEXE sexe, int edat, String nom) {
        this.sexe = sexe;
        this.edat = edat;
        this.nom = nom;
    }

    //Setter


    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    //Getter

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public SEXE getSexe() {
        return sexe;
    }


    //ALtres

    public void print(){
        System.out.printf("%s té  %d anys i es %s. %n",nom,edat,sexe);
    }
}
