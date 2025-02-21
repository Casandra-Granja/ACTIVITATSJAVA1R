package Basiques.ACT;

import java.util.Scanner;

public class NPotenciesDe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2 elevedo a ");
        int N = input.nextInt();
        int I = 0;
        int res = 1;

        while(I<N){
            System.out.println(res);
            res = res*2;
            I=I+1;

        }

    }
}
