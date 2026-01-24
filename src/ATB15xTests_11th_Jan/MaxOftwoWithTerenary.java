package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class MaxOftwoWithTerenary {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter 1st Digit");
        int Digit1 = Scan.nextInt();

        System.out.println("Enter 2nd Digit");
        int Digit2 = Scan.nextInt();

        int Result = (Digit1 > Digit2 )? Digit1 :  Digit2;
        System.out.println("Max of two is " +Result);

    }
}
