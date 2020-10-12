package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

      public static void main(String args[]) {
       String str = "Java Programming";
       String reverseWord = "";

       String[] words = str.split(" ");


       for(int i=0;i<words.length;i++)
       {
           String word = words[i];
           String reverse = "";

           for(int j=word.length()-1;j>=0;j--)
           {
               reverse  = reverse + word.charAt(j);
           }

           reverseWord = reverseWord + reverse + " ";
       }

        System.out.println("Reverse words " + reverseWord);
    }
}
