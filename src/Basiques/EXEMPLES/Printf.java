package Basiques.EXEMPLES;

import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter name: ");
        String nom = input.next();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter weight: ");
        float weight = input.nextFloat();

        System.out.print("Enter Blood type: ");
        char blood =input.next().charAt(0);

        System.out.print("Do you have any allergies: ");
        boolean allergies = input.nextBoolean();

        System.out.printf("My name is %s.%n I'm %d years old. I weight %f.%n My blood type is %c.%n " +
                "Allergies %b", nom, age, weight, blood, allergies);
    }
}
