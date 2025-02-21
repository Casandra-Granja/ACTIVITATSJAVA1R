package Basiques.EXEMPLES.FUNCIONS;

public class FuncióRetorn2 {

    public static void main(String[] args) {

        float p0= 150;
        float p1 = afegirIVA(p0);
        System.out.printf("El preu final es %f", p1);

    }
    public static float afegirIVA(float preu){

        return preu * 1.21f;

    }
}
