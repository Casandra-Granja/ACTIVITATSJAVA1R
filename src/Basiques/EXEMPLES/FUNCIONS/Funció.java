package Basiques.EXEMPLES.FUNCIONS;

public class Funció {

    public static void main(String[] args) {

        int x = 10;
        imprimirNumeros(x,20);
        imprimirNumeros(0,5);
        imprimirNumeros(2,x);


    }

    public static void imprimirNumeros(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.printf("%d%n", i);
        }
    }
}
