package Basiques.ACT;

public class FuncióRecursivaNúmA {

    public static void main(String[] args) {

        String paraula = "hola";
        System.out.print(as(paraula));
    }

        public static int as(String paraula) {
            int numAs = 0;
            int i=0;
            if(paraula.charAt(i)== 'a'){
                numAs++;
                return numAs;
            }
            else{
                int p1 = paraula.indexOf(paraula.charAt(i));
                int p2 = paraula.lastIndexOf(paraula.length());
              return as(paraula.substring(p1,p2));

            }
        }

    }

