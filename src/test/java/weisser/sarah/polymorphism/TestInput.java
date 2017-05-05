package weisser.sarah.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestInput {

    @Test
    public void testGetPets() {
        //given
        Input input = new Input();
        Cat cat = new Cat("Mittens");
        Ferret ferret = new Ferret("Juniper");
        Dog dog = new Dog("Fido");
        Pet pet = new Pet("Petunia");
        Pet[] pets = {cat, ferret, dog, pet};
        input.setPets(pets);
        Pet[] expectedResult = pets;

        //when
        Pet[] actualResult = input.getPets();

        //then
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testPrintPetArray() {

        //given
        Input input = new Input();
        Cat cat = new Cat("Mittens");
        Ferret ferret = new Ferret("Juniper");
        Dog dog = new Dog("Fido");
        Pet pet = new Pet("Petunia");
        Pet[] pets = {cat, ferret, dog, pet};
        input.setPets(pets);
        String expectedResult = "Your pet cat is named Mittens.\n" +
                "It says \"" + cat.speak() + "\"" + "\nYour pet ferret is named Juniper.\n" +
                "It says \"" + ferret.speak() + "\"" + "\nYour pet dog is named Fido.\n" +
                "It says \"" + dog.speak() + "\"" + "\nYour pet pet is named Petunia.\n" +
                "It says \"" + pet.speak() + "\"\n";

        //when
        String actualResult = input.printPetsArray(input.getPets());

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
