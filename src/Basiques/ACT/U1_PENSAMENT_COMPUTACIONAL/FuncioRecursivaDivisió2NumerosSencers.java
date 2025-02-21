package Basiques.ACT.U1_PENSAMENT_COMPUTACIONAL;

public class FuncioRecursivaDivisió2NumerosSencers {
    public static void main(String[] args) {
        System.out.printf("%d / %d és %d.", 10, 4, divisió(10, 4));
    }
    public static int divisió(int a, int b) {

        if (a<b) {
            return 0;
        } else {
            return 1 + divisió(a-b,b);
        }
    }
}
