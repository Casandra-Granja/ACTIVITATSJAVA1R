package Basiques.EXEMPLES.FUNCIONS;

public class FuncióLvocalNo2 {

    public static void main(String[] args) {

        String x = "sakjoaoe";
        System.out.printf("%s te %d vocals",x,numAsR(x));

    }
    public static boolean esunavocal(char c){
        if(c=='a'|| c=='A'||c=='e'|| c=='E'||c=='i'|| c=='I'||c=='o'|| c=='O'||c=='u'|| c=='U'){
            return true;
        }
        else{
            return false;
        }
    }

//Funció Iterativa
    public static int numAs(String s){
        int num = 0;
        for(int i=0; i<s.length(); i++){
            char lletra = s.charAt(i);
            if(esunavocal(lletra)){
                num++;
            }
        }
        return num;
    }
//Funció Recursiva

    public static int numAsR(String s){
        if(s.length()==1 && esunavocal(s.charAt(0))){
            return 1;
        }
       else if(s.length()==1 && !esunavocal(s.charAt(0))) {
            return 0;
        }
       else {
           String tros1 = s.substring(0,s.length()/2);
           String tros2= s.substring(s.length()/2);
           return numAsR(tros1)+ numAsR(tros2);
        }
    }


}
