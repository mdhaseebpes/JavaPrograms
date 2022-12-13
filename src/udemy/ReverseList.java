package udemy;

import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<String> st = Arrays.asList("looking", "you", "handsome", "are");
        String oddS="",evenS="";
        for(int i=0; i<st.size(); i++) {
            if(i%2==1) {
                oddS = oddS + st.get(i)+" ";
            }
            else {
                evenS = evenS + st.get(i)+" ";
            }
        }
        System.out.println(oddS+evenS);
    }
}
