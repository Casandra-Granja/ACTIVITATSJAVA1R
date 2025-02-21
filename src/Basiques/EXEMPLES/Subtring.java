package Basiques.EXEMPLES;

public class Subtring {

    public static void main(String[] args) {
        String nomComplet = "Casandra Granja Peralta";
        int p1 = nomComplet.indexOf(" ");
        int p2 = nomComplet.lastIndexOf(" ");
        String nom= nomComplet.substring(0,p1);
        String llinatge = nomComplet.substring(p1+1, p2);
        String llinatge2= nomComplet.substring(p2+1);

        System.out.printf("%s,%s,%s", nom, llinatge, llinatge2);
    }
}
