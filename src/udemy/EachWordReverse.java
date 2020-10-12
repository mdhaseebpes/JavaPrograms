package udemy;

public class EachWordReverse {

    public static void main(String[] args) {

        String s = "Java Programming";
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

    }
}
