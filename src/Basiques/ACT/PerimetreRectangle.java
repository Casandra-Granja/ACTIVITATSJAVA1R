package Basiques.ACT;

import java.util.Scanner;

public class PerimetreRectangle {
    public static void main (String [] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter altura:");
        double altura = input.nextDouble();

        System.out.print("Enter base:");
        double base = input.nextDouble();


        System.out.println("El perímetre és "+ ((base*2) + (altura * 2)));

    }
}
