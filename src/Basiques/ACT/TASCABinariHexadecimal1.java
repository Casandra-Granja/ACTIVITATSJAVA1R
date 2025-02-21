package Basiques.ACT;

import java.util.Scanner;

public class TASCABinariHexadecimal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insiere el número en binario:");
        long nb = binari2Decimal(input.nextLong());
        long a = nb;
        binari2Decimal(GrupDe4aDecimal(4));
       // System.out.printf("El número en binario %d es el número %s en hexadecimal \n", a, nh);
    }
    public static long binari2Decimal(long nb) {

        while (nb > 0) {
            long rnb = nb % 10000;
            System.out.printf("resta n bi %d\n", rnb);
            nb = nb / 10000;
            System.out.printf("nb %d \n \n", nb);
        }
        return nb;
    }
    public static long GrupDe4aDecimal(int rnb) {
        int pos = 0;
        long nd = 0;

        while (rnb > 0) {
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
        return nd;

    }
    public static void Decimal2Hexa(long nd){

        String nh = "";
        if (nd >= 0 && nd < 10) {
            nh = String.valueOf(nd) + nh;
        } else if (nd == 10) {
            nh = "A";
        } else if (nd == 11) {
            nh = "B";
        } else if (nd == 12) {
            nh = "C";
        } else if (nd == 13) {
            nh = "D";
        } else if (nd == 14) {
            nh = "E";
        } else {
            nh = "F";
        }
    }


}
