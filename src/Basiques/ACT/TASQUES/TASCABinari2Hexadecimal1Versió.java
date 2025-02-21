package Basiques.ACT.TASQUES;

import java.util.Scanner;

public class TASCABinari2Hexadecimal1Versió {
    public static void main(String[] args) {
        /*
        VARIABLES

        nb--> número en binari.
        a--> número en binari per mostrar-ho al output.
        nh--> String on es guarda el número en hexadecimal.
        rnb--> resta de la divisió entre 10000 del número en binari, per tenir els 4 primers números
        nd--> número en decimal
        rrnb--> resta de la divisió entre 10000 de la resta de la divisió entre 10, per tenir el primer número
        del grup de 4 número
        pot--> potència
        pos--> posició

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Insiere el número en binario:");
        long nb= input.nextLong();
        long a= nb;
        String nh= "";


        while(nb>0){
            long rnb = nb%10000;
            System.out.printf("resta n bi %d\n", rnb);
            nb= nb/10000;
            System.out.printf("nb %d \n \n",nb);
            int pos= 0;
            long nd= 0;
            while(rnb >0) {
                long rrnb = rnb % 10;
                System.out.printf("rrnb %d \n", rrnb);
                rnb = rnb / 10;
                System.out.printf("nn %d \n", rnb);
                long pot = (int) Math.pow(2, pos);
                System.out.printf("pot %d \n", pot);
                nd = nd + (rrnb * pot);
                System.out.printf("nd %d \n", nd);
                pos = pos + 1;
                System.out.printf("pos %d \n \n", pos);
            }
            if (nd >= 0 && nd < 10) {
                nh = String.valueOf(nd)+nh;
            } else if (nd == 10) {
                nh = "A" ;
            } else if (nd == 11) {
                nh = "B"  ;
            } else if (nd == 12) {
                nh =  "C";
            } else if (nd == 13) {
                nh =  "D";
            } else if (nd == 14) {
                nh = "E";
            } else {
                nh = "F";
            }
            System.out.printf("El número en binario %d es el número %s en hexadecimal \n",a,nh);
        }

    }
}
