package Basiques.ACT;

import java.util.Scanner;

public class MitjanaSencers {
    public static void main ( String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num A");
        int A = input.nextInt();
        System.out.print("Enter num B");
        int B = input.nextInt();
        System.out.print("Enter num C");
        int C = input.nextInt();

        int num = (A + B + C)/3;

        System.out.println("La mitjana és "+ num);

    }
}
