package Basiques.EXEMPLES.DEFINICIONS;

public class ParàmetresPasPerValorString {
    public static void main(String[] args) {
        String t = "hello";
        System.out.println(t);
        majuscules(t);
        System.out.println(t);

    }
    public static void majuscules(String s){
        System.out.println(s);
        s= s.toUpperCase();
        System.out.println(s);
    }

}
