package udemy;

import java.util.ArrayList;

public class CountStringOccurence {

    public static void main(String[] args) {

        String occurence = "AUTOMATIONENGINEER";
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

        String s1 = "AUTOMATIONENGINEER";
       for(int i=0;i<s1.length();i++)
       {

       }

        String s="oraclE9.9",t="java6.7";
        s=s.replaceAll("[a-zA-Z]","");
        t=t.replaceAll("[a-zA-Z]","");
        Float val1=Float.parseFloat(s);
        Float val2=Float.parseFloat(t);
        float result  = val1 + val2;
        System.out.println("output:" + result);
    }
}
