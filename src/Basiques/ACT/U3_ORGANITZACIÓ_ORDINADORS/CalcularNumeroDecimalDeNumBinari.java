package Basiques.ACT.U3_ORGANITZACIÓ_ORDINADORS;

import java.util.Scanner;

public class CalcularNumeroDecimalDeNumBinari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numero binari:");
        int nb = input.nextInt();
        int pos= 0;
        int nd= 0;

        while(nb>0){
            int d= nb%10;
            int p=(int)Math.pow(2,pos);
            nb=nb/10;
            nd= nd + d*p;
            pos= pos +1;
        }
        System.out.println("Num Decimal:"+nd);

    }
}
