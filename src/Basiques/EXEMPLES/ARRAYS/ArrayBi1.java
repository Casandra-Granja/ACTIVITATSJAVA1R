package Basiques.EXEMPLES.ARRAYS;

public class ArrayBi1 {
    public static void main(String[] args) {
        char[][] meuArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        //Recorregut per files
        System.out.printf("Recorregut per files: \n");
        for (int f = 0; f < meuArray.length; f++) {
            for (int c = 0; c < meuArray[f].length; c++) {
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }
        //Recorrer per columnes
        System.out.printf("Recorregut per files: \n");
        for (int c = 0; c < meuArray[0].length; c++) {
            for (int f = 0; f < meuArray.length; f++) {
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }
        //Recorrer diagonal Descendent Versió 1
        System.out.printf("Recorregut per files Versió 1: \n");
        for (int c = 0; c < meuArray[0].length; c++) {
            for (int f = 0; f < meuArray.length; f++) {
                if (c == f) {
                    System.out.printf("%c\t", meuArray[f][c]);
                }
            }
        }
        //Recorrer diagonal Descendent Versió 2
        System.out.printf("Recorregut per files Versió 2: \n");
        for (int f = 0; f < meuArray[0].length; f++) {
            System.out.printf("%c\t", meuArray[f][f]);
        }
        //Recorrer diagonal Ascendent 2
        System.out.printf("Recorregut per files Versió 2: \n");
        for (int f = 2, c=0; f>=0&&c< meuArray[0].length; f--,c++) {
            System.out.printf("%c\t", meuArray[f][c]);
        }
    }
}
