package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class Divisió {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A:");
        int a = input.nextInt();

        System.out.println("Enter B:");
        int b = input.nextInt();

        double Div = (double) a / b;
        System.out.println(Div);
    }
}