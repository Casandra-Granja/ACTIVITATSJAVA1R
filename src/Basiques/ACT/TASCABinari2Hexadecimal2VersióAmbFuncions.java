package Basiques.ACT;

import java.util.Scanner;

public class TASCABinari2Hexadecimal2VersióAmbFuncions {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Inserte el número en binario: ");
            long nb = input.nextLong();
            String nh = convertirABinariHexadecimal(nb);

            System.out.printf("El número en binario %d es el número %s en hexadecimal\n", nb, nh);
        }


        public static String convertirABinariHexadecimal(long nb) {
            String nh = "";
            while (nb > 0) {
                long rnb = nb % 10000;
                nb /= 10000;

                int nd = convertirGrupo4Decimal(rnb);
                nh = obtenerHexadecimal(nd) + nh;
            }
            return nh;
        }

        public static int convertirGrupo4Decimal(long rnb) {
            int pos = 0;
            int nd = 0;
            while (rnb > 0) {
                long rrnb = rnb % 10;
                rnb /= 10;
                nd += (int) (rrnb * Math.pow(2, pos));
                pos++;
            }
            return nd;
        }

        public static String obtenerHexadecimal(int nd) {
            if (nd < 10) {
                return String.valueOf(nd);
            }
            return switch (nd) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                default -> "F";
            };
        }
    }

