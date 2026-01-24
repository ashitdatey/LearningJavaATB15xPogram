package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class ArithOperationsTwoNum {
    public static void main(String[] args) {

        // Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Digit 1");
        int Digit1 = Sc.nextInt();
        System.out.println("Enter Digit 2");
        int Digit2 = Sc.nextInt();

        int Sum = Digit1 + Digit2;
        {
            System.out.println("Sum is" + Sum);
        }
        int Substract = Digit1 - Digit2;
        {
            System.out.println("Substract is" + Substract);
        }
        int Multiple = Digit1 * Digit2;
        {
            System.out.println("Multiple is" + Multiple);
        }
        if (Digit2 != 0){

            int Division = Digit1 / Digit2;
            System.out.println("Division is" + Division);

            int Remainder = Digit1 % Digit2;
            System.out.println("Remainder is" + Remainder);

        }else
        {
            System.out.println("Division and Remainder are not possible (division by zero");
        }

    }
}

