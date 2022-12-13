package udemy;

public class ReverseSentenceString {

    public static void main(String[] args) {


        String sentence = "Am using intellij";
        String result = "";

        String[] arr = sentence.split(" ");

        for (int k = arr.length - 1; k >= 0; k--) {
            result = result + arr[k];
        }

        System.out.println("Sentence reverse: " + result);

    }
}
