package Basiques.EXEMPLES;

public class ArrayFuncióMitjana {

    public static void main(String[] args) {

        int[] a= {3,8,2,11,25};
        int[] b= {3,8,2,11,25, 59, 99};
        int[] c= {3,8,2,11,25};

        System.out.printf("La suma és %d.", calculaSuma(a));
        System.out.printf("La suma és %d.", calculaSuma(b));
        System.out.printf("La suma és %d.", calculaSuma(c));
    }

    public static int calculaSuma(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }
        public static float calculMitjana(int[] array){

            return calculMitjana(array) / array.length;
        }
    }
