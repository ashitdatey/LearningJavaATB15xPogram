package ex_14_Strings;

import java.util.Scanner;

public class StringVowelAndConsonantCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        String str = scanner.nextLine();   // ✅ read full string

        int Vowels = 0;
        int Consonants = 0;

        // loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check only alphabets
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                        || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    Vowels++;
                } else {
                    Consonants++;
                }
            }
        }

        System.out.println("Vowels = " + Vowels);
        System.out.println("Consonants = " + Consonants);

        scanner.close();
    }
}