package weisser.sarah.class_manager;

import java.util.ArrayList;

/**
 * Created by sarahweisser on 5/2/17.
 */
public class Inventory {

    private ArrayList<Product> productList = new ArrayList<Product>();

    public void addProductToInventory(Product product) {
        productList.add(product);
    }

    public void removeProductFromInventoryById(int id) {
        int index = -1;
        for(Product p : productList) {
            if(p.getId() == id) {
                index = productList.indexOf(p);
            }
        }
        productList.remove(productList.get(index));
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

}
