package collections.shoppingcart.shoppingcart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    static BankAccount newBank;


    @BeforeEach
    void setUp() {
        System.out.println(" ** Before method setUP()");
        newBank = new BankAccount();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After method tear down()");
        newBank = null;
    }

    @Test
    void bank() {
        System.out.println("NOT IMPLEMENTABLE IN JUNIT");
    }

    @Test
    void getCustName() {
        newBank.getCustName();
    }

    @Test
    void getBalance() {
        newBank.getCustName();
    }

    @Test
    void getId() {
        newBank.getId();
    }

    @Test
    void setCustName() {
        newBank.setCustName("Baylee");
    }

    @Test
    void setId() {
        newBank.setId(12);
    }

    @Test
    void checkCard() {
        newBank.checkCard("0000000000000000");
    }

    @Test
    void deposit() {
        System.out.println("NOT IMPLEMENTABLE IN JUNIT");
    }

    @Test
    void withdraw() {
        System.out.println("NOT IMPLEMENTABLE IN JUNIT");
    }

    @Test
    void displayBlance() {
        newBank.displayBlance();
    }

    @Test
    void displayAll() {
        newBank.displayAll();
    }
}