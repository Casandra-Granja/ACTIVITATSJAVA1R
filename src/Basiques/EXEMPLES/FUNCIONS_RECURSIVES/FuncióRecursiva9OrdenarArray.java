package Basiques.EXEMPLES.FUNCIONS_RECURSIVES;

public class FuncióRecursiva9OrdenarArray {
    public static void main(String[] args) {
        int [] nums = {7, 3, 1, 8, 2};
        sort(nums,0);
        printArray(nums);

    }
    public static int posMin(int[] array, int start){
        int valorMinim = array[0 + start];
        int posicióMinim =start;
        for(int i= start+ 1; i<array.length; i++){
            if(array[i]<valorMinim){
                valorMinim= array[i];
                posicióMinim = i;
            }
        }
        return posicióMinim;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d:%d\n", i, array[i]);
        }

    }

    public static void sort(int[] array, int start){
        if(start<array.length-1){
            int pMin= posMin(array, start);
            int temp= array[start];
            array[start]= array[pMin];
            array[pMin]= temp;
            sort(array, start+1);
        }
}
}
