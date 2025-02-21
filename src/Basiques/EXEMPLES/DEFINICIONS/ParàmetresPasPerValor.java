package Basiques.EXEMPLES.DEFINICIONS;

public class ParàmetresPasPerValor {
    public static void main(String[] args) {
        int x= 5;
        System.out.println(x);
        x=sumaUn(x);
        System.out.println(x);

    }
    public static int sumaUn(int n){

        System.out.println(n);
        n=n+1;
        System.out.println(n);
        return n;
    }
}
