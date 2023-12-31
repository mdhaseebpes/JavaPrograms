package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseAndSort {

    // Helper method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "I have a 1 racecar whose fuel level is 60 percent and when it speeds up to 222 kms/hr it cannot be trapped by any radar.";

        // Split the sentence into individual words
        String[] words = str.split(" ");

        // Reverse the words
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }

        // Sort the words based on word length
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        Collections.sort(wordList, Comparator.comparingInt(String::length));

        // Print the sorted words
        for (String word : wordList) {
            System.out.print(word + " ");
        }
    }

}
