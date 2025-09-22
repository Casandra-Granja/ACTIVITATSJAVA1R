package Basiques.ACT.U5_XARXES_ORDINADORS;

public class CodiCesarASCII {


    public static void main(String[] args) {

        int clau = 5;
        String original = "HOLA QUE TAL CESAR!";
        System.out.println("MISATGE ORIGINAL: " + original);

        String xifrat = xifrar(original, clau);
        System.out.println("MISATGE XIFRAT: " + xifrat);

        String desxifrat = desxifrar(xifrat, clau);
        System.out.println("MISATGE DESXIFRAT: " + desxifrat);
    }

    public static char xifrar(char c, int shift) {
        if (Character.isLetter(c) && Character.isUpperCase(c)) {
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if (shiftCode >= 65 && shiftCode <= 90) {
                return (char) shiftCode;
            } else if (shiftCode > 90) {
                shiftCode = 65 + (shiftCode % 26);
                return (char) shiftCode;
            } else {
                shiftCode = shiftCode + 91;
                return (char) shiftCode;
            }
        } else if (Character.isLetter(c) && !Character.isUpperCase(c)) {
            int asciiCode = c;
            int shiftCode = asciiCode + shift;
            if (shiftCode >= 97 && shiftCode <= 122) {
                return (char) shiftCode;
            } else if (shiftCode > 90) {
                shiftCode = 97 + (shiftCode % 26);
                return (char) shiftCode;
            } else {
                shiftCode = shiftCode + 123;
                return (char) shiftCode;
            }
        } else {
            return c;
        }
    }

    public static String xifrar(String original, int shift) {
        String xifrat = "";
        for (int i = 0; i < original.length(); i++) {
            xifrat += xifrar(original.charAt(i), shift);
        }
        return xifrat;
    }

    public static String desxifrar(String xifrat, int shift) {
        return xifrar(xifrat, -shift);
    }
}