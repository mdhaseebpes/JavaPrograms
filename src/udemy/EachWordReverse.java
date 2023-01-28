package udemy;

public class EachWordReverse {

    public static void main(String[] args) {
        /**
         * Each word reverse
         */
        String s = "Hello World ";
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

        System.out.println(reverseWord);

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
