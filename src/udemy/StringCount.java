package udemy;

import java.util.HashMap;
import java.util.Map;

public class StringCount {


        public static void main(String[] args) {

            String word = "AUTOMATION ENGINEER TEST";

            String text=word.replaceAll("\\s", "");

            Map<Character,Integer> charCount=new HashMap<Character,Integer>();
            for(char c:text.toCharArray()) {

                if(charCount.containsKey(c)) {

                    charCount.put(c, charCount.get(c)+1);


                }else {
                    charCount.put(c, 1);
                }



            }
            System.out.println(charCount);
        }
}
