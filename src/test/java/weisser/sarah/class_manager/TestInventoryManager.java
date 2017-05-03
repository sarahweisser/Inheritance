package weisser.sarah.class_manager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/2/17.
 */
public class TestInventoryManager {

    @Test
    public void testInventoryManagerGetInventory() {

        //given
        Inventory inventory = new Inventory();
        Product apple = new Product(001, "apple", 1.50, 15);
        inventory.addProductToInventory(apple);
        InventoryManager manager = new InventoryManager(inventory);
        String expectedResult = "apple";

        //when
        String actualResult = manager.getInventory().getProductList().get(0).getName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGetTotalValueOfInventory() {

        //given
        Inventory inventory = new Inventory();
        Product apple = new Product(001, "apple", 1.50, 15);
        Product orange = new Product(002, "orange", 1.00, 10);
        inventory.addProductToInventory(apple);
        inventory.addProductToInventory(orange);
        InventoryManager manager = new InventoryManager(inventory);
        double expectedResult = 32.50;

        //when
        double actualResult = manager.getTotalValueOfInventory(inventory);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }
}
