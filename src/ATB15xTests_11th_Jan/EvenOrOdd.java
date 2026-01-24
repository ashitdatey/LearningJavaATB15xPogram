package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Write a Java program to check whether a given number is even or odd using arithmetic operators.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a digit to check");
        int Digit = Scan.nextInt();
        if(Digit % 2 == 0)
        {
            System.out.println("It is an even number");
        }
        else
        {
            System.out.println("It is an odd Num");
        }
        Scan.close();
    }

}
