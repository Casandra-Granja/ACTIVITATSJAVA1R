package Basiques.ACT.U3_ORGANITZACIÓ_ORDINADORS;

import java.util.Scanner;

public class TresEnRaya1 {
    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    public enum RESULTAT {ENJOC, EMPAT, GUANYADOR_A, GUANYADOR_B}; //valors possibles d'aquest tipo
    public static RESULTAT resultat; //variable que guarda

    public enum TORN{JUGADOR_A, JUGADOR_B};
    public static TORN torn;

    public static int numTirades;

    public static void main (String[] arg){

        Scanner input = new Scanner(System.in);


        inicialitzaPartida();
        mostrarTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviaTorn(torn);

        }
        mostrarResultat(resultat);
    }

    //no retorna res--> void
    public static void inicialitzaPartida(){
        tauler = new VALOR [3][3];
        for(int i=0; i< tauler.length; i++){
            for(int j=0; j<tauler[i].length; j++){
                tauler[i][j]= VALOR.BUIDA;
            }
        }
        numTirades= 0;
        torn= TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;

    }

    //quan jo cridi a mostrarTauler li he de pasar un array bidimendional
    public static void mostrarTauler(VALOR[][] t){
        for(int i=0; i< t.length; i++){
            for(int j=0; j<t[i].length; j++){
                System.out.print("|");
                switch(t[i][j]){
                    case BUIDA : System.out.print(" ");
                                break;
                    case CREU : System.out.print("X");
                                break;
                    case CERCLE: System.out.print("O");
                                break;
                }
            }
            System.out.println("|");
        }
    }

    //bolean perque retorna
    public static boolean partidaAcabada(){
        return resultat!=RESULTAT.ENJOC;
    }

    public static int demanar(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();

    }

    public static void ferTirada( Scanner input, TORN t, VALOR[][] tauler){

        System.out.println("PARTIDA: "+ resultat);
        System.out.println("PARTIDA: "+ torn);

        int fila, col;
        //do while, entra como poco una vez
        do {
            fila = demanar("Fila: ", input);
            col = demanar("Columna: ", input);

        } while(! tiradaValida(fila,col, tauler));

        //Expresió condicional
        tauler[fila][col] = (t==TORN.JUGADOR_A)? VALOR.CREU : VALOR.CERCLE;

        numTirades++;
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return(f>=0 && f<=2 && c>=0 && c<=2 && t[f][c]==VALOR.BUIDA);
    }

    public static TORN canviaTorn(TORN t){
        if(t== TORN.JUGADOR_A){
            return TORN.JUGADOR_B;
        }
        else {return TORN.JUGADOR_A;
        }

    }

    public static RESULTAT comprovaResultat(VALOR [][] t){

        boolean guanya = false;

        //per files
        for(int f=0; f<=2; f++){
            if(t[f][0]==t[f][1]&&t[f][2]==t[f][1] && t[f][0]!=VALOR.BUIDA){
                guanya = true;
                break;
            }
        }
        //per columnes
        for( int c=0; c<=2; c++){
            if(t[0][c]==t[1][c] && t[1][c]==t[2][c] && t[c][0]!=VALOR.BUIDA){
                guanya = true;
                break;
            }
        }
        //diagnoal descendent
        if(t[2][0]==t[1][1] && t[1][1]==t[0][2] && t[1][1]!=VALOR.BUIDA) {
            guanya = true;
        }

        //diagnoal ascendent
        if(t[0][0]==t[1][1] && t[1][1]==t[2][2] && t[1][1]!=VALOR.BUIDA) {
            guanya = true;
        }

        if(guanya && torn==TORN.JUGADOR_A){
            return RESULTAT.GUANYADOR_A;
        }
        else if(guanya && torn==TORN.JUGADOR_B){
            return RESULTAT.GUANYADOR_B;
        }
        else if (!guanya && numTirades==9){
            return RESULTAT.EMPAT;
        }
        else{
            return RESULTAT.ENJOC;
        }

    }


    //es void per que només imprimeix
    public static void mostrarResultat(RESULTAT r){
        if(r==RESULTAT.EMPAT){
            System.out.println("Partida acabada en empat!!!");
        }else if(r== RESULTAT.GUANYADOR_A){
            System.out.println("Enhorabona Jugador/a A!!!");
        }else if(r==RESULTAT.GUANYADOR_B){
            System.out.println("Enhorabona Jugador/a B!!!");
        }else{
            System.out.println("La partida segueix en joc...");
        }
    }

    }

