package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class ConversióTemperaturaCaFFunció {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºC");
        float C = input.nextFloat();
        float F = (C + 9 / 5f) + 32;
        System.out.println("La temperatura en ºF és " + F);
    }
}
