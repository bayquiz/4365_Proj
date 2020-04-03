
package collections.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.fail;

//import org.junit.Assert;

/**
 *
 * @author edmon
 */
public class CartTest {

    static Cart CartInstance;
    static Product productInstance;
    static Product anotherProd;
    static UI UITest;

    @BeforeEach
    public void setUp() {
        System.out.println("** CartTest: Before method setUp()");
        CartInstance = new Cart();
        productInstance = new Product ();
        anotherProd = new Product ();

    }

    @AfterEach
    public void tearDown() {
        System.out.println(" ** CartTest: After method tearDown()");
        CartInstance = null;
        productInstance = null;
        anotherProd = null;
    }

    /**
     * Test of addProductToCartByPID method, of class Cart.
     */
    @Test
    public void testAddProductToCartByPID() {
        System.out.println("addProductToCartByPID(int pid)");
        int Testpid = 0;

        // TODO review the generated test code and remove the default call to fail.
        CartInstance.addProductToCartByPID(Testpid);

       // CartInstance.printCartItems();
    }

    @Test
    public void getProductByProductIDTest() {
        System.out.println(" ** Testing method getProductByProductID(int pid)");

       System.out.println(CartInstance.getProductByProductID(2));
        //Product actual = CartInstance.getProductByProductID(2);
    }
    /**
     * Test of removeProductByPID method, of class Cart.
     */

    @Test
    public void addToCartTest() {
        System.out.println(" ** Testing addToCart(Product product)");
        productInstance = new Product (6, "EE1302", 12.55, 6);
        CartInstance.addToCart(productInstance );
        CartInstance.printCartItems();
    }

    @Test
    public void testRemoveProductByPID() {
        System.out.println("removeProductByPID");
        productInstance = new Product (6, "EE1302", 12.55, 6);
        CartInstance.addToCart(productInstance );
        CartInstance.printCartItems();

        System.out.println("Now removing item from the cart Items array");
        CartInstance.removeProductByPID(6);
       // CartInstance.printCartItems();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void isOutofStockTest() {
        System.out.println(" ** Testing isOutofStock(int stock)");
        boolean test = true;
        int testStock = 0;
        boolean actual = CartInstance.isOutofStock(testStock);
        Assertions.assertTrue(actual);
    }

    /**
     * Test of calculateCartTotal method, of class Cart.
     */
    @Test
    public void testCalculateCartTotal() {
        System.out.println("** Testing calculateCartTotal()");
        double expTest = 25.55;

        productInstance = new Product (6, "EE1302", 12.55, 6);
        anotherProd = new Product(7, "CS4365", 13.00, 2);

        System.out.println("Created new product.. 6 - EE1302 -- $12.55 - 6 in stock");
        System.out.println(anotherProd);

        CartInstance.addToCart(productInstance);
        System.out.println("Added to cart by product instance");
        CartInstance.addToCart(anotherProd);
        System.out.println("Added to cart by anotherProd");
/*
        CartInstance.addProductToCartByPID(6);
        System.out.println("added to cart by pid 6");
        CartInstance.addProductToCartByPID(7);
        System.out.println("added to cart by pid 7");
*/
        CartInstance.printCartItems();

        System.out.println("Testing the price of the items" );
        productInstance.getPrice();
        anotherProd.getPrice();
       // UITest.showCart();
        double actual = CartInstance.calculateCartTotal();
        System.out.println(CartInstance.calculateCartTotal());
        Assertions.assertEquals(actual, expTest);

        if (expTest != actual) {
            fail("calculateCartTotal() is a prototype");
        }
    }

    /**
     * Test of checkOut method, of class Cart.
     */

    @Test
    public void testCheckOut() {
       System.out.println(" ** Testing method checkOut()");

        System.out.println(" Adding 2 items to my cart so I can start checkout process..");
        productInstance = new Product (9, "ARCH1302", 29.99, 3);
        anotherProd = new Product(10, "CS4331", 45.00, 2);

        CartInstance.addToCart(productInstance);
        System.out.println("Added " + productInstance.getName() + " to cart");
        CartInstance.addToCart(anotherProd);
        System.out.println("Added " + anotherProd.getName() + " to cart");

        System.out.println("Cannot finish checkout process because it requires user input to console");
       // CartInstance.checkOut();

    }




    @Test
    public void printCartItemsTest() {
        System.out.println(" ** Testing method printCartItems()");
        System.out.println(" Adding 2 items to my cart so I can display later..");
        productInstance = new Product (8, "CE1302", 9.99, 3);
        anotherProd = new Product(9, "CS4366", 5.00, 2);

        CartInstance.addToCart(productInstance);
        System.out.println("Added " + productInstance.getName() + " to cart");
        CartInstance.addToCart(anotherProd);
        System.out.println("Added " + anotherProd.getName() + " to cart");


        CartInstance.printCartItems();
    }

}