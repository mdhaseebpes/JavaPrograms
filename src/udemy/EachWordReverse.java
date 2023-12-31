package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EachWordReverse {

    public static void main(String[] args) {
        /**
         * Each word reverse
         */
        String s = "Hello World a Continue aa weee";
        String reverseWord = "";

        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++)
        {
            String word  = words[i];
            String reverse = "";

            for(int j= word.length()-1;j>=0;j--)
            {
                reverse = reverse + word.charAt(j);
            }

             reverseWord = reverseWord + reverse + " ";
        }

      //  System.out.println(reverseWord);

        List<String> wordList = new ArrayList<>();
        for(String word: words){
            wordList.add(word);
        }


        Collections.sort(wordList, Comparator.comparingInt(String::length));

        // Print the sorted words
        for (String word : wordList) {
            System.out.print(word + " ");
        }

        /**
         * Sentence reverse
         */

        String sentence = "Am using intellij";
        String result  = "";

         String[] arr =sentence.split(" ");

        for(int k=arr.length-1;k>=0;k--)
        {
            result = result + arr[k] + " ";
        }

        System.out.println("Sentence reverse: " + result);
    }
}
