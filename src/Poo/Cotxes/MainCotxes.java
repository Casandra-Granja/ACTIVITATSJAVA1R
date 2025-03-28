package Poo.Cotxes;

public class MainCotxes {
    public static void main(String[] args) {

        //Declaracions

        Cotxes c1, c2, c3;

        //Cridades a Construccions
        c1= new Cotxes("Audi", "ABC345", 4, 0);
        c2= new Cotxes("Seat", "DEF789", 2, 0);
        c3= new Cotxes("Cupra", "GHI101", 5, 0);

        //Setters
        c1.setMatricula("AaBb22");
        c2.setMarca("Audi");
        c3.setNumPortes(2);

        //Getters
        System.out.printf("La matricula del coche 1 es %s y la marca del coche 2 es %s. \n", c1.getMatricula(), c3.getMarca());

        //Altres
        c1.print();
        c2.print();
        c3.print();
    }
}
