package Poo.Alumne.Cotxes;

public class Cotxes {
    //Propietats o atributs
    String marca;
    String matricula;
    int numPortes;
    float velocitat;

    // Constructors
    Cotxes(String ma, String mat, int n, float v ){
        marca= ma;
        matricula= mat;
        numPortes= n;
        velocitat= v;
    }

    //Setters
    void setMarca(String ma){
        marca= ma;
    }
    void setMatricula(String mat){
        matricula= mat;
    }
    void setNumPortes(int n){
        numPortes= n;
    }
    void velocitat(float v){
        velocitat= v;
    }

    //Getters
    String getMarca(){
        return marca;
    }
    int getNumPortes(){
        return numPortes;
    }
    String getMatricula(){
        return matricula;
    }
    float getVelocitat(){
        return velocitat;
    }

    //Altres

    void print(){
        System.out.printf("matrícula: %s, marca: %s, Numero de portes: %d, velocitat: %f, \n", matricula, marca, numPortes, velocitat);
    }
}
