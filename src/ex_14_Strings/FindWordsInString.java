package ex_14_Strings;

import java.util.Scanner;

public class FindWordsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = scanner.nextLine();

        // Trim leading & trailing spaces
        str = str.trim();

        int wordCount = 0;

        if (!str.isEmpty()) {
            // Split by one or more spaces
            String[] words = str.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}