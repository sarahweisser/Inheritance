package weisser.sarah.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestCat {

    @Test
    public void testGetCatName() {

        //given
        Cat cat = new Cat("Mittens");
        String expectedResult = "Mittens";

        //when
        String actualResult = cat.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void setCatName() {

        //given
        Cat cat = new Cat("pet");
        cat.setName("not pet");
        String expectedResult = "not pet";

        //when
        String actualResult = cat.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCatSpeak() {

        //given
        Cat cat = new Cat("Mittens");
        String expectedResult = "I make people sneeze, but they like me because I am pretty.";

        //when
        String actualResult = cat.speak();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
