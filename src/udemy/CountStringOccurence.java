package udemy;

import java.util.ArrayList;

public class CountStringOccurence {

    public static void main(String[] args) {

        String word = "AUTOMATION ENGINEER TEST";
       String occurence=word.replaceAll(" ","");
        ArrayList<Character> list  = new ArrayList<Character>();

        for(int i=0;i<occurence.length();i++){
            int k=0;
            if(!list.contains(occurence.charAt(i)))
            {
                    list.add(occurence.charAt(i));
                    k++;
                for(int j=i+1;j<occurence.length();j++)
                {
                    if(occurence.charAt(i)==occurence.charAt(j)){
                        k++;
                    }
                }

                System.out.println(occurence.charAt(i) + " is repeated :  " + k);
            }

        }






    }
}
