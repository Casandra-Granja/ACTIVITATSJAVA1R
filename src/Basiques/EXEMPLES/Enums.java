package Basiques.EXEMPLES;

public class Enums {
    static enum Sexe {HOME, DONA}
    static enum EstatCivil {ESTUDIA, TREBALLA}
    static enum Estudis{ CAP, ESO, BATXILLERAT, FP}


    public static void main (String[] arg){

        Sexe a = Sexe.HOME;
        Sexe b = Sexe.DONA;
        EstatCivil c = EstatCivil.ESTUDIA;

        System.out.println(a + "," + b +","+ c);

    }
}

