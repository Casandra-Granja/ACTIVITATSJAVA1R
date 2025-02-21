package Basiques.ACT.U3_ORGANITZACIÓ_ORDINADORS;

public class CalcularBinariADecimal {
    public static void main(String[] args) {

        int baseOrigen= 10;
        int baseDesti= 2;
        int no = 125;
        int pos= 0;
        int nd= 0;
        int pot= 1;

        while(no >0){
            int d= no %baseDesti;
            no = no /baseDesti;
            nd= nd + d*pot;
            pos= pos +1;
            pot= pot * baseOrigen;
        }
        System.out.println("Num Decimal:"+nd);

    }
}
