package Basiques.EXEMPLES;

public class ArrayBiImprimirInterval {
    public static void main(String[] args) {
        int m1 [][]= {{2,4,5},{3,7,4}};
        minterval(0,5,m1);
    }
    public static void  minterval(int a, int b, int[][]m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j< m[i].length; j++ ){
                if(m[i][j]>=a && m[i][j]<=b){
                    System.out.printf("%d\t", m[1][j]);
                }

            }
        }

    }
}
