package collections.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    Products productsInstance;

    @BeforeEach
    void setUp() {
        System.out.println(" ** ProductsTest: Before method setUp()");
        productsInstance = new Products();
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ** ProductsTest: After method tearDown()");
        productsInstance = null;
    }

    @Test
    void getProducts() {
        System.out.println(" ** Testing method getProducts()");
        productsInstance.getProducts();
    }

    @Test
    void initStoreItems() {
        System.out.println("Testing method initStoreItems()");
        productsInstance.getProducts();
    }
}