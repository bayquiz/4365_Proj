import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;




public class BankAccount {
	Scanner input= new Scanner(System.in);
	private int balance;
	private String CustName;
	private int Id;
	

	public static void main(String[] args) {
		BankAccount b= new BankAccount();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name: ");
		 b.CustName= input.nextLine();
		b.getCustName();
		System.out.println("Enter id: ");
		 b.Id= input.nextInt();
		b.getId();
		System.out.println("Enter balance: ");
		 b.balance= input.nextInt();
		b.getBalance();
		
		 System.out.println("Menu");
		 System.out.println("1.Deposit");
		 System.out.println("2.Withdraw");
		 System.out.println("3.Display all");
		 System.out.println("4.Exit");
		 boolean q= false;
		 int choice;
		 
		 do {
			 System.out.println("Enter your choice: ");
			 choice= input.nextInt();
			 
			 switch(choice) {
			 case 1:
				 b.deposit();
				 break;
			 case 2:
				 b.withdraw();
				 break;
			case 3:
				b.displayAll();
				break;
			case 4:
				 q= true;
				 System.out.println("Thank you for shopping");
				 break;
				 
			 }
			 
		 
		 }
		 while(!q);
	}
	
public BankAccount() {
	CustName=" ";
	Id= 0;
	balance= 0;
	
}

public String getCustName() {
	return CustName;
}

public double getBalance() {
	return balance;
}

public int getId() {
	return Id;
}

public void setCustName(String name) {
	CustName=name;
}

public void setId(int p) {
	Id=p;
}
public static boolean checkCard(String cardNo)
{
	int number = cardNo.length();

	int sum = 0;
	boolean isNumber = false;

	for (int i = number - 1; i >= 0; i--)
	{
		int num = cardNo.charAt(i) - '0';

		if (isNumber == true)
		{
			num = num * 2;
		}

		sum += num / 10;
		sum += num % 10;

		isNumber = !isNumber;
	}

	return (sum % 10 == 0);
}


public void deposit() {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your Credit Card Number");

	while(true)
	{
		String cardNo = input.nextLine();

		if (checkCard(cardNo))
		{
			System.out.println("Valid credit card number\n");

			Scanner input2 = new Scanner(System.in);
			final int MAX_LENGTH = 3;
			int cvvNo = 0;
			
			System.out.println("Please enter the CVV of this card");
			while(true)
			{
				cvvNo = input2.nextInt();

				if (String.valueOf(cvvNo).length() == MAX_LENGTH)
				{
					System.out.println("Valid CVV number");
					break;
				}
				else
					System.out.println("Invalid CVV number. Please enter 3 digits only.");
			}
			break; // Breaks the loop
		}
		else
			System.out.println("Invalid card number. Please try again.");
	}

	System.out.println("Enter amount to deposit: ");
	int amount;
	amount=input.nextInt();
	balance= balance + amount;
}

public void withdraw() {
	System.out.println("Balance=" + balance);
	System.out.print("Enter amount to withdraw:");
	int amount;
	amount=input.nextInt();
	if (balance<amount) {
		System.out.println("Insufficient funds");
	}
	balance =balance - amount;
}

public void displayBlance() {
	System.out.println("Bank Account: "+CustName);
	System.out.println("The amount in the account is: "+balance);
	
}

public void displayAll() {
	System.out.println("Name: " +CustName);
	System.out.println("id: " +Id);
	System.out.println("balance: " +balance);
}


	
	

}
