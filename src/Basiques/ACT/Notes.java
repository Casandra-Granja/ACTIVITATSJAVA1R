package Basiques.ACT;

import java.util.Scanner;

public class Notes {
    public static void main( String [] arg){

        Scanner input= new Scanner(System.in);

        System.out.print("Enter nota: ");
        double nota = input.nextDouble();

        if (nota>=0 && nota<5 ){
            System.out.println("SUSPÈS");
        }
        else if(nota == 5){
            System.out.println("SUFICIENT");
        }
        else if(nota == 6){
            System.out.println("BÉ");
        }
        else if(nota>=7 && nota<=9 ){
            System.out.println("NOTABLE");
        }
        else if(nota>=9 && nota<=10 ){
            System.out.println("EXCELENT");
        }
        else{
            System.out.println("NOTA NO VÀLIDA");
        }



    }
}
