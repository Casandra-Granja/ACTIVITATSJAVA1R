package Poo.Profes;

public class MainProfesor {
    public static void main(String[] args) {
        //Decalració

        Profesor p1, p2, p3;

        // Cridades als constructors
        p1= new Profesor("Manel", 35, Profesor.DEPARTAMENT.FÍSICA);
        p2= new Profesor("Xesca", 22, Profesor.DEPARTAMENT.CATALÀ);
        p3= new Profesor("Biel", Profesor.DEPARTAMENT.MATES);

        //Setters (mutadores)
        p3.setAnys(15);
        p1.setNom("manel Ernest");
        p2.setDepartament(Profesor.DEPARTAMENT.ANGLÈS);

        // Getters

        int sumaAnys= p1.getAnys()+p2.getAnys() + p3.getAnys();
        System.out.printf("SUMA ANYS: %d. \n", sumaAnys);

        //Altres

        p1.print();
        p2.print();
        p3.print();

    }

}
