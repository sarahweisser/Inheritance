package weisser.sarah.polymorphism;

import weisser.sarah.polymorphism.Cat;
import weisser.sarah.polymorphism.Dog;
import weisser.sarah.polymorphism.Ferret;
import weisser.sarah.polymorphism.Pet;

import java.util.Scanner;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Input {

    private int numberOfPets;
    private String type;
    private String name;
    private Pet[] pets;

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }
    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
    public Pet[] getPets() {
        return pets;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getUserNumOfPets() {

        System.out.print("How many pets do you have? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();
        setNumberOfPets(numberOfPets);
        return numberOfPets;

    }

    public String getTypeOfPet() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please state type of pet (Cat, Dog or Ferret): ");
        String type = scanner.next();
        setType(type);
        return type;

    }

    public String getNameOfPet() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is that pet's name? ");
        String name = scanner.next();
        setName(name);
        return name;

    }

    public Pet[] makePetArray(int numberOfPets) {

        Pet[] pets = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {

            type = getTypeOfPet();
            name = getNameOfPet();

            if (type.equalsIgnoreCase("Ferret")) {

                Ferret ferret = new Ferret(name);
                pets[i] = ferret;

            } else if (type.equalsIgnoreCase("Cat")) {

                Cat cat = new Cat(name);
                pets[i] = cat;

            } else if (type.equalsIgnoreCase("Dog")) {

                Dog dog = new Dog(name);
                pets[i] = dog;

            } else {

                System.out.println("I don't recognize that type of animal.  I will refer to it as a pet only.");
                Pet pet = new Pet(name);
                pets[i] = pet;

            }
        }
        return pets;
    }

    public String printPetsArray(Pet[] pets) {

        String string = "";
        for(int i = 0; i < pets.length; i++) {
            String petString = ("Your pet " + pets[i].getSpecies() + " is named " + pets[i].getName() + ".\nIt says \"" + pets[i].speak() + "\"\n");
            string += petString;
        }
        return string;
    }


}

