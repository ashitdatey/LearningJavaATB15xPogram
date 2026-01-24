package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class ReverseNumDoWhile {
    public static void main(String[] args) {
        //Write a Java program to reverse a given number using a do-while loop.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int number = Scan.nextInt();
        int reverse = 0;

        do {
            int digit = number % 10;        // get last digit
            reverse = (reverse * 10) + digit; // add digit to reverse
            number = number / 10;           // remove last digit
        } while (number != 0);

        System.out.println("Reversed number is: " + reverse);
    }

}
