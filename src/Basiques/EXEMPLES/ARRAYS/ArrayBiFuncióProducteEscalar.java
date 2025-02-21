package Basiques.EXEMPLES.ARRAYS;

import static Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL.ArrayBiFuncióSuma.imprimir;

public class ArrayBiFuncióProducteEscalar {
    public static void main(String[] args) {

        int[][] matriuA= {{2,4,5},{1,7,3},{0,5,1}};

        imprimir(producteEscalar(3, matriuA));
    }

    public static int[][] producteEscalar (int k, int[][]m){
        int[][] p = new int[m.length][m[0].length];
        for(int i=0; i<m.length; i++){
            for(int  j=0; j<m[1].length; j++){
                p[i][j]= k*m[i][j];
            }
        }
        return p;
    }
}

