package Basiques;

import java.util.Arrays;

public class SistemaDaus {
    public static void main(String[] args) {
        double[][] probabilitat = new double[3][6];
        System.out.println(Arrays.deepToString(Tirardaus(probabilitat)));}

    public static double[][] Tirardaus(double [][]a){
        double[][] probabilitat = new double[3][6];

        for(int i=0;i<=100;i++){
        double caraAleatoria = 1 + Math.floor( Math.random() * 6 );

        if(caraAleatoria == 1){
            probabilitat[0][0] = probabilitat[0][0] + 0.01;
        }
        else if(caraAleatoria==2){
            probabilitat[0][1] = probabilitat[0][1] + 0.01;
        }
        else if(caraAleatoria==3){
            probabilitat[0][2] = probabilitat[0][2] + 0.01;
        }
        else if(caraAleatoria==4){
            probabilitat[0][3] = probabilitat[0][3] + 0.01;
        }
        else if(caraAleatoria==5){
            probabilitat[0][4] = probabilitat[0][4] + 0.01;
        }
        else if(caraAleatoria==6){
            probabilitat[0][5] = probabilitat[0][5] + 0.01;
        }
        }
        for(int j=0;j<=1000;j++){
            double caraAleatoria = 1 + Math.floor( Math.random() * 6 );

            if(caraAleatoria == 1){
                probabilitat[1][0] = probabilitat[1][0] + 0.001;
            }
            else if(caraAleatoria==2){
                probabilitat[1][1] = probabilitat[1][1] + 0.001;
            }
            else if(caraAleatoria==3){
                probabilitat[1][2] = probabilitat[1][2] + 0.001;
            }
            else if(caraAleatoria==4){
                probabilitat[1][3] = probabilitat[1][3] + 0.001;
            }
            else if(caraAleatoria==5){
                probabilitat[1][4] = probabilitat[1][4] + 0.001;
            }
            else if(caraAleatoria==6){
                probabilitat[1][5] = probabilitat[1][5] + 0.001;
            }
        }
        for(int p=0;p<=1000000;p++){
            double caraAleatoria = 1 + Math.floor( Math.random() * 6 );

            if(caraAleatoria == 1){
                probabilitat[2][0] = probabilitat[2][0] + 0.000001;
            }
            else if(caraAleatoria==2){
                probabilitat[2][1] = probabilitat[2][1] + 0.000001;
            }
            else if(caraAleatoria==3){
                probabilitat[2][2] = probabilitat[2][2] + 0.000001;
            }
            else if(caraAleatoria==4){
                probabilitat[2][3] = probabilitat[2][3] + 0.000001;
            }
            else if(caraAleatoria==5){
                probabilitat[2][4] = probabilitat[2][4] + 0.000001;
            }
            else if(caraAleatoria==6){
                probabilitat[2][5] = probabilitat[2][5] + 0.000001;
            }
        }
        return probabilitat;
    }
}
