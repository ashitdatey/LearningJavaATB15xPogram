package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class PosNegZeroCheck {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int Num = Scan.nextInt();

        String PosNegZeroCheck = (Num > 0) ? "Positive" : ((Num < 0) ? "Negative" : "Zero") ;
        System.out.println("Number is : "+PosNegZeroCheck);
    }
}
