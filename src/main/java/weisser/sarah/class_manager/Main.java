package weisser.sarah.class_manager;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class Main {

    public static void main(String[] args) {

        Product apple = new Product(001, "apple", 1.50, 15);
        Product orange = new Product(002, "orange", 2.00, 10);
        Inventory inventory = new Inventory();
        inventory.addProductToInventory(apple);
        inventory.addProductToInventory(orange);
        InventoryManager manager = new InventoryManager(inventory);
        System.out.println(manager.getTotalValueOfInventory(inventory));
    }
}
