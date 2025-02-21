package Basiques.ACT;

import java.util.Scanner;

public class ConversióTemperaturaDeFaC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºF");
        float f = input.nextFloat();
        float c = 5 /9f * (f-32);
        System.out.println("La temperatura en ºC és " + c);

    }

}
