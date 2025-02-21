package Basiques.EXEMPLES;

public class FuncióRecursiva6GirarParaula {

    public static void main(String[] args) {
        String n = "Hola";
        System.out.printf("%s girat és %s", n,girarparaula(n));
    }
    public static String girarparaula(String n){
        if(n.length()==1){
            return n;
        }
        else{
            char inicial= n.charAt(0);
            String n2= n.substring(1);
            return girarparaula(n2) + inicial;
        }
    }
}
