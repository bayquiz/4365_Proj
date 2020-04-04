package collections.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product shirt;
    Product pants;
    Product shoe;
    Product hat;
    Cart cartNew;

    @BeforeEach
    void setUp() {
        System.out.println(" ** Before method setUp()");
        shirt = new Product ();
        pants = new Product ();
        shoe = new Product ();
        hat = new Product ();

    }

    @AfterEach
    void tearDown() {
        System.out.println(" * After method tearDown()");
        shirt = null;
        pants = null;
    }

    @Test
    void getName() {
        System.out.println(" ** Testing method getName()");
        shirt = new Product(123456, "Yellow Halter Top", 5.99, 2); // instance of the object shirt
        pants = new Product(789012, "Ripped Jeans", 25.99, 12); // instance of the object pants
        System.out.println(" Should return name of a shirt: " + shirt.getName());
        System.out.println(" Should reutrn name of the pants: " + pants.getName());

    }

    @Test
    void setName() {
        System.out.println(" ** Testing method setName()");
        String test = "Book";
        Product book = new Product();
        book.setName("book");
    }

    @Test
    void getPrice() {
        System.out.println(" ** Testing method getPrice()");
        shirt = new Product(123456, "Yellow Halter Top", 5.99, 2);
        System.out.println("Created a shirt with price: " + shirt.getPrice());
    }

    @Test
    void setPrice() {
        System.out.println(" ** Testing method setPrice(Double price)");
        Product newnew = new Product();
        newnew.setPrice(5.99);

        System.out.println("Set price to $5.99 with .setPrice(5.99).... Confirming with getPrice(): " + newnew.getPrice());
    }

    @Test
    void getStock() {
        System.out.println(" ** Testing method getStock()");
        pants = new Product(789012, "Ripped Jeans", 25.99, 12);
        System.out.println("Created pants with price " + pants.getPrice());
    }

    @Test
    void setStock() {
        System.out.println(" ** Testing method setStock(int stock)");
        Product stocks = new Product();
        stocks.setStock(5);

        System.out.println("Set stock to 5 with .setStock(5).. confirming with getStock()" + stocks.getStock());
    }

    @Test
    void getPid() {
        System.out.println(" ** Testing method getPid()");
        pants = new Product(789012, "Ripped Jeans", 25.99, 12);

        System.out.println("Created pants with pid: " + pants.getPid());
    }

    @Test
    void setPid() {
        System.out.println(" ** Testing method setPid(int pid)");

        Product shoes = new Product();
        shoes.setPid(12345);
        System.out.println("Set PID to 12345 with shoes.setPid(12345), confirming with shoes.getPid(): " + shoes.getPid() );
    }

    @Test
    void hashCodeTest() {
        pants.hashCode();
    }

    @Test
    void equalsTest() {
        shirt.equals(pants);

        shirt.equals(shirt);
    }
    @Test
    void equalsTest2() {

        shoe = new Product(44, "Nike", 95.99, 2);
        hat = new Product(57, "Baseball cap", 19.96, 4);

        shoe.equals(hat);

        Product bloop = null;
        hat.equals(bloop);
    }
    @Test
    void equalsTest3() {
        shoe = new Product(44, "Nike", 95.99, 2);
        cartNew = new Cart();
        cartNew.equals(shoe);
        Product shoe2;
        shoe2 = new Product(44, "Nikes", 95.99, 2);

        shoe.equals(shoe);
        shoe.equals(shoe2);
    }

}


