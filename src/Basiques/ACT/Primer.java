package Basiques.ACT;

import java.util.Scanner;

public class Primer {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Número;");
        int n = input.nextInt();
        int t = n-1;

        while(n>=1) {
            if (n % t == 0) {
                break;
            }
            t = t - 1;
        }
        if (t==1){
            System.out.printf("%d és primer", n);
        }
        else {
            System.out.printf("%d no és primer", n);
        }

    }
}

