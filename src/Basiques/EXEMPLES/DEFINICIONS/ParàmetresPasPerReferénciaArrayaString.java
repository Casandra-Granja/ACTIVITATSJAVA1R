package Basiques.EXEMPLES.DEFINICIONS;

public class ParàmetresPasPerReferénciaArrayaString {
    public static void main(String[] args) {
        int[] x= {5,10,15};
        System.out.println(array2String(x));
        addOne(x);
        System.out.println(array2String(x));

        //Pas per valor; tipus basics int, float, char, string, informació cridad,copia exactament igual, es fa feina sobra
        // la copia, no l'original--> Tipus bàsic, int, float, char, string, boolean, si hi ha un return si que el modifica
        // Pas per referencia: menos als arrays, no passam una copia, pasam el valor directament, el modifica,
        // Arrays.

    }
    public static String array2String(int[]n){

        String txt= "";
        for(int i=0; i<n.length; i++){
            txt +=n[i]+ ",";
        }
        return txt;
    }
    public static void addOne(int[]n){

        System.out.println(array2String(n));
        for(int i=0; i<n.length; i++){
            n[i]=n[i]+1;
        }
        System.out.println(array2String(n));
    }
}
