package Basiques.EXEMPLES.SUBSTRING;

public class Substring2 {

    public static void main(String[] args) {
        String paragraf= "Hola que tal com va";

        int numParaules=0;

        while(paragraf.indexOf(' ')!=-1) {

            int posBlank = paragraf.indexOf(' ');
            String paraula = paragraf.substring(0, posBlank);
            paragraf = paragraf.substring(posBlank + 1);
            numParaules++;

            System.out.println(paraula);
        }
        System.out.println(paragraf);
        System.out.println(numParaules+1);
    }
}
