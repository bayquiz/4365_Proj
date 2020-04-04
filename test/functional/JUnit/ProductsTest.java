package collections.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductsTest {

    Products productsInstance;
    Product Book;
    Product Bag;

    @BeforeEach
    void setUp() {
        System.out.println(" ** ProductsTest: Before method setUp()");
        productsInstance = new Products();
        Book = new Product();
        Bag = new Product();
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ** ProductsTest: After method tearDown()");
        productsInstance = null;
        Book = null;
        Bag = null;
    }

    @Test
    void getProducts() {
        System.out.println(" ** Testing method getProducts()");
        Book = new Product(123, "Art Book", 12.99, 1);
        System.out.println(productsInstance.getProducts());
    }

    @Test
    void initStoreItems() {
        System.out.println("Testing method initStoreItems()");
        productsInstance.initStoreItems();

    }
}