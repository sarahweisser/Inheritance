package weisser.sarah.polymorphism;

import java.util.Scanner;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.print("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();
        String[][] pets = new String[numberOfPets][2];

        for(int i = 0; i < numberOfPets; i++) {
            System.out.println("Please state type of pet: ");
            pets[i][0] = scanner.next();
            System.out.println("What is that pet's name? ");
            pets[i][1] = scanner.next();
        }

        for(int i = 0; i < pets.length; i++) {
            System.out.println("Type: " + pets[i][0] + "\tName: " + pets[i][1]);
        }
    }
}
