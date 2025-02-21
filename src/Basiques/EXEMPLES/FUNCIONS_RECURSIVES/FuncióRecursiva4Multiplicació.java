package Basiques.EXEMPLES.FUNCIONS_RECURSIVES;

public class FuncióRecursiva4Multiplicació {

    public static void main(String[] args) {
        int a= 4;
        int b= 2;
        System.out.print(multiplicació(a,b));

    }

    public static int multiplicació(int a,int b){

        if(a==0|| b==0){
            return 0;
        }
        else {
            return multiplicació(a,b-1) + a;

        }
    }
}
