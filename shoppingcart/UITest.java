package collections.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UITest {

    //not sure if this is really needed
    static UI newUI;
    static UI UIInstance;
    static UI uiPractice;
    static Cart cartInstance;
    static Product productInstance;


    @BeforeEach
    void setUp() {
        System.out.println(" * UI TEST: Before method setup()");
        //cannot initialize using UI() constructor because it calls for user input in method
        newUI = new UI();
        UIInstance = new UI();
        uiPractice = new UI();
        cartInstance = new Cart();
        productInstance = new Product();
    }


    @AfterEach
    void tearDown() {
        System.out.println(" * UI TEST: After method tearDown()");
        UIInstance = null;
        newUI = null;
        uiPractice = null;
    }

    @Test
    public void startScreen() {
        System.out.println("Testing method 'Start Screen', should display menu... NOT IMPLEMENTABLE");
        //not actually being tested
        System.out.println("UI TEST: method 1 - startScreen()");
        UIInstance.startScreen();


    }

    @Test
    void storeProductsMenu() {
        System.out.println("Testing method 'storeProductsMenu()... displays menu.. NOT IMPLEMENTABLE");
        System.out.println("UI TEST: method 2 - storeProductsMenu()");
        //not sure if this is necessary to test
        //UIInstance.storeProductsMenu();
        UIInstance.storeProductsMenu();
    }

    @Test
    void cartMenu() {
        System.out.println("Testing method 'cartMenu'... it will show cart menu.... NOT IMPLEMENTABLE");
        System.out.println("UI TEST: method 2 - cartMenu()");
        uiPractice.cartMenu();

    }


    @Test //NOT IMPLEMENTABLE
    void menu() {
        System.out.println("CANNOT TEST METHOD MENU()... REQUIRES USER CONSOLE INPUT!!");
    }


    @Test
    void innerChoice1() {
        System.out.println("CANNOT TEST METHOD innerChoice1().. REQUIRES USER CONSOLE INPUT");
    }

    @Test
    void innerChoice2(){
        System.out.println("CANNOT TEST METHOD innerChoice2()... REQUIRES USER CONSOLE INPUT");
    }

    @Test
    void getUserInput(){
        System.out.println("CANNOT TEST METHOD getUserInput()....REQUIRES USER INPUT TO CONSOLE");
    }

    @Test
    void displayStoreProducts(){
        System.out.println(" * Testing method displayStoreProducts()");
        UIInstance.displayStoreProducts();

    }

    @Test
    void addProductToCart(){
        System.out.println("CANNOT TEST METHOD addProductToCart()... REQUIRES USER INPUT TO CONSOLE!!");
    }

    @Test
    void showCart(){
        System.out.println("Testing method showCart() WITH EMPTY CART");
       // UIInstance.showCart();

        System.out.println("Now testing after I add an architecture book!");
        productInstance = new Product(123, "ARCH IV", 34.99, 3);
        cartInstance.addToCart(productInstance);
        cartInstance.printCartItems();

        System.out.println("Cannot test the rest of the method.. requires user input to console!");
    }

    @Test
    void removeProductFromCart(){
        System.out.println("CANNOT TEST METHOD removeProductFromCart().. REQUIRES USER INPUT FOR PID NUMBER");
    }

    @Test
    void filterProducts(){
        System.out.println("CANNOT TEST METHOD filterProducts()... requires user input for filter ID");
    }
}