package weisser.sarah.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestDog {

    @Test
    public void testGetDogName() {

        //given
        Dog dog = new Dog("Fido");
        String expectedResult = "Fido";

        //when
        String actualResult = dog.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void setDogName() {

        //given
        Dog dog = new Dog("pet");
        dog.setName("not pet");
        String expectedResult = "not pet";

        //when
        String actualResult = dog.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDogSpeak() {

        //given
        Dog dog = new Dog("Fido");
        String expectedResult = "I'm man's best friend.";

        //when
        String actualResult = dog.speak();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
