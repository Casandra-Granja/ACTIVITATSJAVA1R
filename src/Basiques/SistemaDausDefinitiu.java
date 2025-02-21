package Basiques;

public class SistemaDausDefinitiu {

        public static void main(String[] args) {

            float [][] cares = new float[3][6];

            int[] tirades = {100, 1000, 1000000};

            for(int numProva = 0; numProva <tirades.length; numProva++) {
                int numTirades = tirades[numProva];

                for (int i = 0; i < numTirades; i++) {
                    int dau = tirarDau();
                    cares[numProva][dau - 1]++;
                }

                for (int cara = 0; cara < cares[numProva].length; cara++) {
                    cares[numProva][cara] /= numTirades;
                }

                System.out.printf("Experiment de tirar el dau %d vegades:\n", tirades[numProva]);

                float total = 0;

                for (int cara = 0; cara < cares[numProva].length; cara++) {

                    System.out.printf("\tLa probabilitat d'un %d és de %f.%n", cara + 1, cares[numProva][cara]);

                    total += cares[numProva][cara];
                }
                System.out.printf("Total: %f.\n\n", total);
            }

        }

        public static int tirarDau(){

            return (int) Math.floor(1 + Math.random()*6);
        }
    }

