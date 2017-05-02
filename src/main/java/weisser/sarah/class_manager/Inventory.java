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

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
