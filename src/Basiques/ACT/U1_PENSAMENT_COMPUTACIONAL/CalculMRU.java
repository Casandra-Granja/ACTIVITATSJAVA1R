package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class CalculMRU {

    public static void main(String [] arg) {
        Scanner input =  new Scanner (System.in);

        System.out.print("Enter posició inicial;");
        float Xo = input.nextFloat();
        System.out.print("Enter Velocitat inicial;");
        float Vo = input.nextFloat();
        System.out.print("Enter temps:");
        float t = input.nextFloat();
        float x = Xo + Vo * t;

        System.out.println("El desplaçament es de " + x);

    }
}
