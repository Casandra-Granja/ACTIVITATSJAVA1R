package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

import java.util.Scanner;

public class MultiplicacióSenseMultiplicar {
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);

        System.out.println("Enter A");
        int A = input.nextInt();
        System.out.println("Enter B");
        int B = input.nextInt();
        int I = 0;
        int res= 0;
        while (I<A){
            res= res+B;
            I= I+1;
        }
        System.out.print(res);
    }
}
