package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class CalculForça {
    public static void main(String [] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter massa:");
        float massa = input.nextFloat();
        System.out.print("Enter acceleració:");
        float acceleració = input.nextFloat();

        System.out.println ("La força es de " + massa * acceleració);
    }
}
