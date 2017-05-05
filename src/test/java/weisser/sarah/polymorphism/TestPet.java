package weisser.sarah.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestPet {

    @Test
    public void testPetGetName() {

        //given
        Pet pet = new Pet("pet");
        String expectedResult = "pet";

        //when
        String actualResult = pet.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testPetSetName() {

        //given
        Pet pet = new Pet("pet");
        pet.setName("not pet");
        String expectedResult = "not pet";

        //when
        String actualResult = pet.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPetSpeak() {

        //given
        Pet pet = new Pet("pet");
        String expectedResult = "pet";

        //when
        String actualResult = pet.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
