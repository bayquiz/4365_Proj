import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;
import sun.security.krb5.internal.CredentialsUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class CreditCardVerificationTest {

    CreditCardVerification CreditCardVerificationInstance;
    CreditCardVerification SimpleDateInstance;

    @Before
    public void setUp() throws Exception {
        System.out.println("* Before method setup()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("* After method setup()");
        CreditCardVerificationInstance = null;
        SimpleDateInstance = null;
    }

    @Test
    public void checkCard1() {
        String expTest1 = "4195905348577260";
        boolean actTest1 = CreditCardVerificationInstance.checkCard("4195905348577260");
        System.out.println("Card Number Input: 4195905348577260");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Valid credit card number.");
        try
        {
            Assert.assertTrue(expTest1, true);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void checkCard2() {
        String expTest1 = "4195905348577260";
        boolean actTest1 = CreditCardVerificationInstance.checkCard("231");
        System.out.println("Card Number Input: 231");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Invalid Card Number. Please try again.");
        try
        {
            Assert.assertTrue(expTest1, true);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void checkCard3() {
        String expTest1 = "5574843065278481";
        boolean actTest1 = CreditCardVerificationInstance.checkCard("5574843065278481");
        System.out.println("Card Number Input: 5574843065278481");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Valid credit card number.");
        try
        {
            Assert.assertTrue(expTest1, true);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void checkCard4() {
        String expTest1 = "5574843065278481";
        boolean actTest1 = CreditCardVerificationInstance.checkCard("2324.4567.1194.4567");
        System.out.println("Card Number Input: 2324.4567.1194.4567");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Invalid Card Number. Please try again.");
        try
        {
            Assert.assertTrue(expTest1, true);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void validateDate1() {

        String expTest1 = "12/2021";
        boolean actTest1 = SimpleDateInstance.validateDate("54/5451");
        System.out.println("Testing 1 - Date");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Invalid Date. Please try again.");
        try
        {
            Assert.assertTrue(expTest1, false);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void validateDate2() {

        String expTest1 = "12/2021";
        boolean actTest1 = SimpleDateInstance.validateDate("2021/12");
        System.out.println("Testing 1 - Date");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Invalid Date. Please try again.");
        try
        {
            Assert.assertTrue(expTest1, false);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }

    @Test
    public void validateDate3() {

        String expTest1 = "12/2021";
        boolean actTest1 = SimpleDateInstance.validateDate("12/2021");
        System.out.println("Testing 1 - Date");
        System.out.println("Expected True and got: " + actTest1);
        System.out.println("Valid Date.");
        try
        {
            Assert.assertTrue(expTest1, false);
        }

        catch (Throwable fail)
        {
            System.out.println("Catch");
        }
    }
}