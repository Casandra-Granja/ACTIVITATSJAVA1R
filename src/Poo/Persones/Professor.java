package Poo.Persones;

public class Professor extends Persona {

    int anysDocent;
    String departament;

    //Constructor

    Professor(String n, int e, SEXE s,int a, String d){
        super(s,e,n);
        this.anysDocent= a;
        this.departament= d;
    }

    //Setter

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }


    //Getter

    public int getAnysDocent() {
        return anysDocent;
    }

    public String getDepartament() {
        return departament;
    }


    //Altres

    public void print(){
        System.out.printf("%s du %d anys aguantant als alumnes i es professor de %s", nom,anysDocent,departament);
    }

}
