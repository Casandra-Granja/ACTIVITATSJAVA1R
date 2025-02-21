package Basiques.ACT;

import java.util.Scanner;

public class CalculMRUA {


    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter posició inicial;");
        float Xo = input.nextFloat();
        System.out.print("Enter Velocitat inicial;");
        float Vo = input.nextFloat();
        System.out.print("Enter temps:");
        float t = input.nextFloat();
        System.out.print("Enter acceleració:");
        float a = input.nextFloat();
        


        System.out.println("El desplaçament es de " + (Xo + Vo * t + 0.5 * a * t * t));
    }

}