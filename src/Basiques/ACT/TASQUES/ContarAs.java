package Basiques.ACT.TASQUES;

public class ContarAs {
    public static void main(String[] args) {
        String p = "HOLA";
        System.out.print(contarAs(p));

    }

    public static int contarAs(String P) {

        if (P.length() == 1 && P.charAt(0) == 'A') {
            return 1;
        } else if (P.length() == 1 && P.charAt(0) != 'A') {
            return 0;
        } else {
            String P1 = P.substring(0, P.length() / 2);
            System.out.println(P1);
            String P2 = P.substring(P.length() / 2, P.length());
            System.out.println(P2);
            return contarAs(P1) + contarAs(P2);
        }
    }
}
