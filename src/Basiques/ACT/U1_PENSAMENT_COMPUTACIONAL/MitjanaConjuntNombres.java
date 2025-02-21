package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class MitjanaConjuntNombres {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float suma = 0;
        int c = 0;


        do{
            System.out.println("Número: ");
            int n =input.nextInt();
            if(n==0){
                break;
            }
            suma += n;
            c++;
        }while(true);
        System.out.printf("La Mitjana dels números és %f.", suma/c);
    }
}
