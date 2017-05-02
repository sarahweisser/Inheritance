package weisser.sarah.class_manager;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by sarahweisser on 5/2/17.
 */
public class testInventory {

    @Test
    public void testAddProductToInventory() {

        //given
        Inventory inventory = new Inventory();
        Product apple = new Product(001, "apple", 1.00, 10);
        int expectedSize = 1;

        //when
        inventory.addProductToInventory(apple);
        int actualSize = inventory.getProductList().size();

        //then
        Assert.assertEquals(expectedSize, actualSize);

    }
}
