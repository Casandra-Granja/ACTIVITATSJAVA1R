package Basiques;

public class SistemaDaus2 {

    public static void main(String[] args) {
        float[][] probabilitats = new float[3][6];

        probabilitats[0] = calcularProbabilidades(100);
        probabilitats[1] = calcularProbabilidades(1000);
        probabilitats[2] = calcularProbabilidades(1000000);

        System.out.println("Resultados del experimento (cada fila representa un número de tiradas):");
        for (int fila = 0; fila < probabilitats.length; fila++) {
            System.out.print("Tiradas (" + (int) Math.pow(10, fila + 2) + "): ");
            for (int columna = 0; columna < probabilitats[fila].length; columna++) {
                System.out.printf("%.6f ", probabilitats[fila][columna]);
            }
            System.out.println();
        }
    }

    public static float[] calcularProbabilidades(int lanzamientos) {
        float[] probabilidades = new float[6];

        for (int i = 0; i < lanzamientos; i++) {
            int caraAleatoria = (int) (Math.random() * 6);
            probabilidades[caraAleatoria] += 1;
        }
        for (int i = 0; i < 6; i++) {
            probabilidades[i] /= lanzamientos;
        }

        return probabilidades;
    }
}