package Basiques.EXEMPLES.FUNCIONS;

import java.util.Scanner;

public class FuncióValorAbsolut {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter n");

        float f = input.nextFloat();
        float af = absolut(f);
        System.out.printf( "El valor absolut de %f es %f", f, af);

    }

    public static float absolut(float n){
        if(n>=0){
            return n;
        }
        else{
            return -n;
        }

    }
}

