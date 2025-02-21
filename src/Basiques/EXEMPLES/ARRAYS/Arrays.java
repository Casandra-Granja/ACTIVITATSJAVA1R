package Basiques.EXEMPLES.ARRAYS;

public class Arrays {

    public static void main(String[] args) {


        //Definició de creació
        String[] noms = {"Paco", "Pep", "Bel", "Jaume"};

        noms[0]= "Xisco";
        noms[123]= "Xisco";

        //Recorregut Ascendent
        for (int i = 0; i < noms.length; i++) {
            System.out.printf("%s.\n",noms[i]);
        }

        //Recorregut Descendent
        for (int i = noms.length-1;i>0; i++) {
            System.out.printf("%s.\n",noms[i]);
        }
    }
}

