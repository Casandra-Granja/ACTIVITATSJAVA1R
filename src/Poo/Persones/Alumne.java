package Poo.Persones;

public class Alumne extends Persona{

    int curs;
    int grup;

    //Constructor

    Alumne(String n, int e, SEXE s, int c, char g){
        super(s, e, n);
        this.curs= c;
        this.grup= g;
    }

    //Setter

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setGrup(int grup) {
        this.grup = grup;
    }

    //Getter

    public int getCurs() {
        return curs;
    }

    public int getGrup() {
        return grup;
    }

    //ALtres
    public void print(){
        System.out.printf("%s va a %d - %c. %n",nom,curs,grup);
    }
}
