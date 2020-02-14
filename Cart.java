package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;


class Cart {

    List<Product> cartItems = new ArrayList<Product>();

    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
    }

    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }


    public void removeProductByPID(int pid) {
        Product prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }
//NEEDS TO BE IMPLEMENTED
    private boolean isOutofStock(int stock){
        return(stock -1) < 0;
    }

    public double calculateCartTotal(){
        double total = 0.00d;
        for(Product prod: cartItems){
            total += prod.getPrice();
          //  System.out.println("Your CART total is:      $" + total);
          //  System.out.println("Your CART total is:  $" + total);
        }
        //System.out.println("Your cart total is: $" + total);
        return total;
        //System.out.println("$" + total);
    }
    public void checkOut() {
        double leftover = 0.00d;
        System.out.println("Your total today is: $" + calculateCartTotal());
        if(BankAccount.getBalance() > calculateCartTotal()) {
            System.out.println("Process complete! You have sufficient funds!");
        }
        else {
            leftover = calculateCartTotal() - BankAccount.getBalance();
            System.out.println("You owe $" + leftover + " . Please pay with a credit card!");
            CreditCardVerification.card_ask();
        }
    }


  //  public void printTotal(double total) {
        //System.out.println("Your cart total is: $" + total)
    //}
    void printCartItems() {
        System.out.println("$$$$$$$$$$$$$$$  YOUR CART  $$$$$$$$$$$$$$$");
        for (Product prod: cartItems) {
            System.out.println(prod.getPid() + "- " + prod.getName() + "  $" + prod.getPrice() );
        }
        if(cartItems.size() == 0) {
            System.out.println("Your cart is empty!");
        }
       // System.out.println("$$$$$$$$$$$$$$ end of your cart $$$$$$$$$$$$$$$");
        //System.out.println("\n");

        //cart needs to show total price
    }

}