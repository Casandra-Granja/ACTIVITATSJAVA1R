package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class AreaRectangle {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Costat A:");
        int a = input.nextInt();

        System.out.print("Enter Costat B:");
        int b = input.nextInt();

        double area = a * b;
        System.out.println(area);

    }
}
