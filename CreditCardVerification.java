package collections.shoppingcart;
import java.util.Scanner;

class CreditCardVerification
{
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

    public static void card_ask()
    {
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
    }
}
