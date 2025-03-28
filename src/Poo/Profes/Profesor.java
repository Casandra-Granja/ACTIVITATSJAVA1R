package Poo.Profes;

public class Profesor {

    enum DEPARTAMENT {FÍSICA, MATES, CATALÀ, ANGLÈS};

    //Atributs o propietats

    String nom;
    int anys;
    DEPARTAMENT departament;

    //Mètodes

    //Constructor(s)
    Profesor(String n, int a, DEPARTAMENT d){
        nom= n;
        anys= a;
        departament= d;
    }
    Profesor(String n, DEPARTAMENT d){
        nom= n;
        anys= 0;
        departament= d;
    }

    //Setters (mutadorea)

    void setNom(String n){
        nom= n;
    }
    void setAnys(int a){
        anys= a;
    }
    void setDepartament(DEPARTAMENT d){
        departament= d;
    }

    String getNom(){
        return nom;
    }
    int getAnys(){
        return anys;
    }
    DEPARTAMENT getDepartament(){
        return departament;
    }

    //Altres

    void print(){
        System.out.printf("%s,%s (%d). \n", nom, departament, anys);
    }
}
