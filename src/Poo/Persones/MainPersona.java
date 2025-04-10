package Poo.Persones;

public class MainPersona {

    public static void main(String[] args) {
        Alumne a1, a2;
        Persona p1;
        Professor pr1;
        Jugador j1;

        p1= new Persona(Persona.SEXE.DONA,12, "Sky");
        a1= new Alumne("Pep", 10, Persona.SEXE.HOME, 1,'A');
        a2= new Alumne("Maria", 15, Persona.SEXE.DONA, 2,'B');
        pr1= new Professor("Manuel", 59, Persona.SEXE.HOME, 40, "Física");
        j1= new Jugador("Max", 16, Persona.SEXE.HOME, 50, Jugador.POSICIO.MIG, "Baleares");

        a1.print();
        a2.print();
        p1.print();
        pr1.print();
        j1.print();

    }
}
