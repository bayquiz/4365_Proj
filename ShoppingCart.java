/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Scanner;

/**
 *
 * @author edmon
 */
public class ShoppingCart {   //Initialiaze amount in account and quantity for each items in the store
  static int account = 5000;
  static int iPhone5qty = 600;
  static int iPhone7qty = 22;
  static int SamsungS8qty = 18;
  static int Motorolaqty = 21;
  static int Lgqty = 9;
  static int ip;
  static int iph;
  static int sa;
  static int mo;
  static int l;
  
  
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Welcome to your Phones store!!!"+ '\n');
        
        //while(true){  //Display the menu Items,
        do {   
        System.out.println("Make a selection" + "\n");
            System.out.println("Enter 1 to buy an item:");
           // System.out.println("Enter 2 to buy:");
            //System.out.println("Enter 2 to add to the inventory:");
            System.out.println("Enter 2 to check Balance:");
            System.out.println("Enter 3 to leave:" + "\n");
            Scanner input = new Scanner (System.in);
            int num = input.nextInt();
            //System.out.println(num + ")");
            switch(num){
                case 1: // Add to cart before checkout
                    System.out.println("Menu items and Prices:");
                    System.out.println("Enter the number corresponding to your choice" + "\n");
                    System.out.println("PHONES:            PRICES:");
                    System.out.println("iPhone5,   enter 1: $10");
                    System.out.println("iPhone7,   enter 2: $90");
                    System.out.println("SamsungS8, enter 3: $25");
                    System.out.println("Motorola,  enter 4: $12");
                    System.out.println("Lg,        enter 5: $20" + "\n");
                    System.out.println("Which one do you want to buy" + "\n");
                    int num1 = input.nextInt();
                   // System.out.println(num1 + "\n");
                    if (num1 == 1 && account >= 10) {
                        System.out.println("How many iPhone5 do you want to buy ?" + "\n");
                        ip = input.nextInt();
                          if ((account >= (10*ip)) && (ip <= iPhone5qty)) {
                        System.out.println("You have successfully bought " + ip + " " + "iPhone5" + "\n");
                        System.out.println("Thank you for your order, you paid "+ "$" + " " + 10*ip + "\n");
                        iPhone5qty -=ip;
                        account = account - (ip*10);
                         }
                         else {
                            
                      System.out.println("Unsuccessfull transaction, " + "\n" + "Please check your account balance or the number of Iphone5 left in the inventory." + "\n");
                         }
                    }
                    if (num1 == 2 && account >= 90){
                       System.out.println("How many iPhone7 do you want to buy ?" + "\n");
                        iph = input.nextInt();
                          if ((account >= (90*iph)) && (iph <= iPhone7qty)) {
                        System.out.println("You have successfully bought " + iph + " " + "iPhone7" + "\n");
                        System.out.println("Thank you for your order, you paid "+ "$" + " " + 10*iph + "\n");
                        iPhone7qty -=iph;
                        account = account - (iph*90);
                         }
                         else {
                            
                      System.out.println("Unsuccessfull transaction, " + "\n" + "Please check your account balance or the number of Iphone7 left in the inventory." + "\n");
                         }
                    }
                    if (num1 == 3 && account >= 25){
                        System.out.println("How many SamsungS8 do you want to buy ?" + "\n");
                        sa = input.nextInt();
                          if ((account >= (25*sa)) && (sa <= SamsungS8qty)) {
                        System.out.println("You have successfully bought " + sa + " " + "SamsungS8" + "\n");
                        System.out.println("Thank you for your order, you paid "+ "$" + " " + 10*sa + "\n");
                        SamsungS8qty -=sa;
                        account = account - (sa*25);
                         }
                         else {
                            
                      System.out.println("Unsuccessfull transaction, " + "\n" + "Please check your account balance or the number of SamsungS8 left in the inventory." + "\n");
                         }
                    }  
                    if (num1 == 4 && account >= 12){
                        System.out.println("How many Motorola do you want to buy ?" + "\n");
                        mo = input.nextInt();
                          if ((account >= (12*mo)) && (mo <= Motorolaqty)) {
                        System.out.println("You have successfully bought " + mo + " " + "Motorola" + "\n");
                        System.out.println("Thank you for your order, you paid "+ "$" + " " + 10*mo + "\n");
                        Motorolaqty -=mo;
                        account = account - (mo*12);
                         }
                         else {
                            
                      System.out.println("Unsuccessfull transaction, " + "\n" + "Please check your account balance or the number of Motorola left in the inventory." + "\n");
                         }
                    }
                    if (num1 == 5 && account >= 20){
                        System.out.println("How many Lg do you want to buy ?" + "\n");
                        l = input.nextInt();
                          if ((account >= (20*l)) && (l <= Lgqty)) {
                        System.out.println("You have successfully bought " + l + " " + "Lg" + "\n");
                        System.out.println("Thank you for your order, you paid "+ "$" + " " + 10*l + "\n");
                        Lgqty -=l;
                        account = account - (l*20);
                         }
                         else {
                            
                      System.out.println("Unsuccessfull transaction, " + "\n" + "Please check your account balance or the number of Lg left in the inventory." + "\n");
                         }
                    }
                            
                    break;
              /* case 2:  
                    String b;
                    Scanner in = new Scanner (System.in); 
                     System.out.println("What do you want to buy ? iPhone5, iphone7, SamsungS8, Motorola or Lg" + "\n");
                     b = in.nextLine();
                     System.out.println("How much is the item you want to buy ?" + "\n");
                      Float p = input.nextFloat();
                       System.out.println("You have successfully bought " + b + "\n");
                       account = (int) (account * p);
                       break;*/
                       
              /*  case 2:   // Returns
                    Scanner re = new Scanner (System.in);
                     System.out.println("What would you like to return ?" + "\n");
                     String s = re.nextLine();
                     
                      System.out.println("You have successfuly returned the " + s);
                      
                       System.out.println("Here are all the items you bought" + "\n");
                       
               break;*/
               
                case 2:   // How much is left in the cart
                     System.out.println("Your account account balance is " + account + "\n");
                     System.out.println("Here are all Items left in the inventory " + "\n");
                     System.out.println(iPhone5qty + " iPhone5" + "\n");
                     System.out.println(iPhone7qty + " iPhone7" + "\n");
                     System.out.println(SamsungS8qty + " SamsungS8" + "\n");
                     System.out.println(Motorolaqty + " Motorola" + "\n");
                     System.out.println(Lgqty + " Lg" + "\n");
                     break;
                     
                case 3: // Leave
                     System.out.println("Thank you for shopping with us.");
                     System.exit(0);
                     
                    
                    //System.out.println("Thank you for shopping with us.");  
                        
                    
                    
            }
                  
        } while (true); 
       // }
    }
    
}
