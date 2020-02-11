package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;


public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initStoreItems() {
        String [] productNames = {"ART1301", "CS4365", "MATH2336", "ARCH2331"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d, 15.99d};
        Integer [] stock = {10, 6, 10, 2};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}