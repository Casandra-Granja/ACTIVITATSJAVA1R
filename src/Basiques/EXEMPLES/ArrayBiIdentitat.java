package Basiques.EXEMPLES;

import static Basiques.ACT.ArrayBiFuncióSuma.imprimir;

public class ArrayBiIdentitat {
    public static void main(String[] args) {
        int n =8;
        imprimir(matriuI(n));
    }
    public static int[][] matriuI(int n){
        int[][] m =new int[n][n];

        for(int i =0; i<m.length; i++){
            m[i][i]= 1;
        }

        return m;
    }
}
