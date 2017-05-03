package weisser.sarah.class_manager;

/**
 * Created by sarahweisser on 5/2/17.
 */
public class InventoryManager {

        private Inventory inventory;

        public InventoryManager(Inventory inventory) {
            this.inventory = inventory;
        }

        public Inventory getInventory() {
            return inventory;
        }

        public double getTotalValueOfInventory(Inventory inventory) {
            double totalValue = 0;
            for(Product p : inventory.getProductList()) {
                totalValue += (p.getPrice() * p.getQuantity());
            }
            return totalValue;
        }


}
