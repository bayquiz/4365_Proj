package collections.shoppingcart;

import java.util.List;
import java.util.Scanner;


public class UI {

    Cart cart = new Cart();
    private int ch = 0;

    public UI() {
        menu();
    }

    public void startScreen() {
        System.out.println("~~~~~~~~~~  Hello, welcome to our store!  ~~~~~~~~~~");
        System.out.println("               ***** MENU ******                    ");
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("3. Sell Items.");
        System.out.println("4. Create Account");
        System.out.println("5. Make a return");
        System.out.println("0. Exit");
    }

    public void storeProductsMenu() {
        System.out.println("************************************");
        System.out.println("1. Add to Cart");
       // System.out.println("2. Remove From Cart");
        System.out.println("2. Filter Products by price.");     //newly added
        System.out.println("0. Exit");
    }
    public void cartMenu() {
        System.out.println("1. Checkout.");
        System.out.println("2. Remove item.");
        System.out.println("3. Return to main menu.");
    }

    public void menu() {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    //Display store products
                    displayStoreProducts();     //displays list of products, price, stock
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    //Display cart
                    showCart();
                    cartMenu();
                    getUserInput();
                    innerChoice2();
                    //System.out.println("Would you like to checkout?");
                    break;
                case 3:
                    System.out.println("not functioning yet...");

                    break;

                case 4:
                    BankAccount.bank();
                    menu();

                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        //this is the menu for what to do after viewing store catalog
        switch (ch) {
            case 1:
                //add to cart
                System.out.println("Which item would you like to add to your cart?");
                displayStoreProducts(); //refresh their mind w list of products
                addProductToCart();
                System.out.println("Successfully added to your cart!");
                //need to update stock by -1
                break;
         //   case 2:
          //      System.out.println("Which item would you like to remove from your cart?");
           //     showCart();
            //    removeProductFromCart();
             //   break;
            case 2:
                //filter by price
                filterProducts();
                storeProductsMenu();
                getUserInput();
                //need to still show filtered list when asked to buy
                break;
            default:

                break;
        }
    }

    private void innerChoice2() {
        //this is the menu for being inside the cart
        switch (ch) {
            case 1:
                System.out.println("Starting the Checkout process now ...");
                //needs to show total price
                //call payment verification function
                CreditCardVerification.card_ask();
                //eventually ask for shipping location?
                break;
            case 2:
                System.out.println("Which item would you like to remove?");
                showCart();
                removeProductFromCart();
                showCart();
                //need to update stock?
                break;
            case 3:
                storeProductsMenu();
            default:

                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        System.out.println("**********  Store Catalog **********");
        List<Product> products = new Products().getProducts();
        for (Product prod : products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + "  $" +
                            prod.getPrice() + ",  " +
                            prod.getStock() + " remaining!"
            );
        }
        System.out.println("**********  End of Store **********");
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
        //need to update stock...
    }

    private void showCart() {

        cart.printCartItems();
        System.out.println("Your total is: ");
        cart.calculateCartTotal();
        System.out.println("$$$$$$$$$$$$$$$$  end of your cart    $$$$$$$$$$$$$$$$$$");
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }

    private void filterProducts() {
        //function to filter store catalog items by price
        System.out.println("Products less than $50: ");
        List<Product> items = new Products().getProducts();
        for (Product prod : items) {
            if (prod.getPrice() < 50.00) {
                System.out.println(
                        prod.getPid() + "- " +
                                prod.getName() + "  $" +
                                prod.getPrice() + ",  " +
                                prod.getStock() + " remaining!"
                );
            }   //end of if < 50$
        } //end of for
    }// end of filter products



}