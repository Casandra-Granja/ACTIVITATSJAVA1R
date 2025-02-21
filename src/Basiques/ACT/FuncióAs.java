package Basiques.ACT;

public class FuncióAs {

    public static void main(String[] args) {

        String s = "Cantar";
        System.out.print(recorrer(s));
    }

    public static int recorrer(String s) {
        int numAs = 0;
        int i;
        for(i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                numAs = numAs + 1;
            }
        }
        return numAs;
    }
}
