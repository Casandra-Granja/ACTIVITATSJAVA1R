package Basiques.EXEMPLES.FUNCIONS_RECURSIVES;

public class FuncióRecursiva7MenjarBocataTrosAleatori {
    public static void main(String[] args) {

        String bocata = "bocatademortadela";
        menjar(bocata);
    }
    public static String mossegar (String s){
        int mida = 1+(int)(Math.random()*4);
        return s.substring(0,mida);
    }
    public static Boolean esTragable (String s){
        return s.length()<=4;
    }
    public static void tragar(String s){
        System.out.print(s);
        System.out.println("  Nyamm!");
    }
    public static String llevar (String b, String t){
        return b.replaceFirst(t,"");
    }
    public static void menjar (String b){
        if(esTragable(b)){
            tragar(b);
        }
        else{
            String boci = mossegar(b);
            String restant = llevar(b,boci);
            menjar(boci);
            menjar(restant);
    }
    }
}
