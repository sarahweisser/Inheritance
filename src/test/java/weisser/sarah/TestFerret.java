package weisser.sarah;

import org.junit.Assert;
import org.junit.Test;
import weisser.sarah.polymorphism.Ferret;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestFerret {

    @Test
    public void testGetFerretName() {

        //given
        Ferret ferret = new Ferret("Juniper");
        String expectedResult = "Juniper";

        //when
        String actualResult = ferret.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void setFerretName() {

        //given
        Ferret ferret = new Ferret("pet");
        ferret.setName("not pet");
        String expectedResult = "not pet";

        //when
        String actualResult = ferret.getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testFerretSpeak() {

        //given
        Ferret ferret = new Ferret("Juniper");
        String expectedResult = "I will steal all your socks.";

        //when
        String actualResult = ferret.speak();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }
}
