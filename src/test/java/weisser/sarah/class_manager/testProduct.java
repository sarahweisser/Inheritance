package weisser.sarah.class_manager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/2/17.
 */
public class testProduct {

    @Test
    public void testProductFields() {

        //given
        Product apple = new Product(001, "apple", 1.00, 10);
        long expectedId = 001;
        String expectedName = "apple";
        double expectedPrice = 1.00;
        int expectedQuantity = 10;

        //when
        long actualId = apple.getId();
        String actualName = apple.getName();
        double actualPrice = apple.getPrice();
        int actualQuantity = apple.getQuantity();

        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice, 0);
        Assert.assertEquals(expectedQuantity, actualQuantity);

    }

}
