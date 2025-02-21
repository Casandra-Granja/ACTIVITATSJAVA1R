package Basiques.ACT;

import java.util.Scanner;

public class MàximDeDosNúmeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter númeor;");
        int N1 = input.nextInt();
        System.out.print("Enter númeor;");
        int N2 = input.nextInt();

        if(N1<N2){
            System.out.println( N2 + " es el màxim ");
        }
        else {
            System.out.println( N1 + " es el màxim");
        }
    }
}

