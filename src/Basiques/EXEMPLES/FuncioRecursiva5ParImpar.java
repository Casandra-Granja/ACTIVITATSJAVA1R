package Basiques.EXEMPLES;

import java.util.Scanner;

public class FuncioRecursiva5ParImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numero: ");

        int b =input.nextInt();
        System.out.print("impar "+impar(b)+" par "+espar(b));

    }

    public static boolean espar(int b) {
        if (b == 0) {
            return true;
        } else {
            return impar(b - 1);
        }
    }

    public static boolean impar(int b) {
        if (b == 0) {
            return false;
        } else {
            return espar(b - 1);
        }
    }
}

