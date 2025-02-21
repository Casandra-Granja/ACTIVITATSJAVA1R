package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class MínimDeDosNúmeros {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter número;");
            int N1 = input.nextInt();
            System.out.print("Enter número;");
            int N2 = input.nextInt();

            String s = " es el minim";
            String ss = " es el mininm";
            String missatge = N1 > N2 ? N2 + s : N1 + ss;

            System.out.println(missatge);

        }

        }

