package ATB15xTests_11th_Jan;

import java.util.Scanner;
//Write a Java program to print the month name based on the month number (1–12) using a switch statement.

public class MonthFinder {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Month Num from 1 to 12");

        if(Scan.hasNextInt()) {
            int Num = Scan.nextInt();
            switch (Num) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
            else
            {
                System.out.println("enter the valid num only between 1 to 12");
            }
        }
    }

