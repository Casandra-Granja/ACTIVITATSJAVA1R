package Basiques.ACT;

import java.util.Scanner;

public class PreuCinema {
    public static void main(String []arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numero d'entrades;");

        int num = input.nextInt();

        int preu;

        if(num>0 && num<5){
            preu = 5;
        }
        else if(num<10){
            preu = 4;
        }
        else {
            preu = 3;
        }

        int total = num* preu;
        System.out.println("Total price: "+total);


    }

}
