package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class PorterDiscoteca {
    public static void main(String [] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter edat;");
        int edat = input.nextInt();

        String missatge = edat >= 18 ? "Pots entrar" : "No pots entrar";

        System.out.println(missatge);
    }
}
