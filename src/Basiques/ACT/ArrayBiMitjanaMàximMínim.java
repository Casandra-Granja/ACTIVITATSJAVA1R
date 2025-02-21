package Basiques.ACT;

public class ArrayBiMitjanaMàximMínim {
    public static void main(String[] args) {
        int[][] x = {{2,4,5}, {5,9,10}};
    }

    public static int mínimMatriu(int[][]m){
        int minim= m[0][0];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length;){
                if(m[i][j]<minim){
                    minim= m[i][j];
                }
            }
        }
        return minim;
    }
    public static int maximMatriu(int[][]m){
        int maxim= m[0][0];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length;){
                if(m[i][j]>maxim){
                    maxim= m[i][j];
                }
            }
        }
        return maxim;
    }
    public static float maitjanaMatriu(int[][]m){
        int num= m.length * m[0].length;
        float suma= 0f;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length;){
                suma+= m[i][j];

            }
        }
        return suma/num;
    }

   }