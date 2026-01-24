package ATB15xTests_11th_Jan;

import java.util.Scanner;

public class DayOftheWeekSwitch {
    public static void main(String[] args) {
        //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the day number from 1 to 7");

        if(Scan.hasNextInt()) {
            int Day = Scan.nextInt();
            switch (Day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
        else
        {
            System.out.println("Please enter the valid number from 1 to 7");
        }

    }
}
