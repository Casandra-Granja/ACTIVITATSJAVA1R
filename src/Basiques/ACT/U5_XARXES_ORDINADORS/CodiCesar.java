package Basiques.ACT.U5_XARXES_ORDINADORS;

public class CodiCesar {
    public static final char[] ALPHABET26 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char xifrar(char c, int shift){
        int pos = -1;
        for( int i = 0; i<ALPHABET26.length; i++){
            if(ALPHABET26[i]== c) {
                pos = i;
            }

        }
        if(pos>=0) {
            int shiftPos= (pos+ shift);
            //Cas me pas per la dreta
            if(shiftPos>= ALPHABET26.length) {
                shiftPos = (pos + shift) % ALPHABET26.length;
            }
            //Cas que no es pasa
            else if(shiftPos>=0 && shiftPos<ALPHABET26.length){
                shiftPos= shiftPos;
            }
            //Cas me pas per la esquerra
            else if( shiftPos<0){
                shiftPos= ALPHABET26.length + shiftPos;

            }
            return ALPHABET26[shiftPos];
        }
        else{
           return c;
        }

    }

    public static String xifrar(String original, int shift){
        String xifrat= "";
        for(int i=0; i<original.length(); i++){
            xifrat += xifrar(original.charAt(i), shift);
        }

        return xifrat;
    }
    public static String desxifrar(String xifrat, int shift){
      return xifrar(xifrat, - shift);

    }

    public static void main(String[] args) {

        int shift= 5;

        String original = "HOLA QUE TAL CESAR!";
        System.out.println("Missatge Original:"+ original);


        String xifrat= xifrar(original, shift);
        System.out.println("Missatge Xifrat:"+ xifrat);

        String desxifrat= desxifrar(xifrat, shift);
        System.out.println("Missatge Desxifrat:"+ desxifrat);

    }

}

