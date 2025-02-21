package Basiques.EXEMPLES;

public class FuncióRecursiva9OrdenarDescendentArray {
    public static void main(String[] args) {
        int [] nums = {7, 3, 1, 8, 2};
        posMax(nums,3);

    }
    public static int posMax(int[] array, int end){
        int valorMaxim = array[0];
        int posicióMaxim =0;
        for(int i= 0; i<= array.length; i++){
            if(array[i]>valorMaxim){
                valorMaxim= array[i];
                posicióMaxim = i;
            }
        }
        return posicióMaxim;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d:%d\n", i, array[i]);
        }

    }

    public static void sort(int[] array, int end){
        if(end>0){
            int posMax= posMax(array, end);
            int temp= array[end];
            array[end]= array[posMax];
            array[posMax]= temp;
            sort(array, end-1);
        }
}
}
