package udemy;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountStringArray {

    public static void printCount(String[] ar){

        Map<String, Integer> output = new LinkedHashMap<String,Integer>();


        for(int i=0; i<ar.length;i++){

            String str = ar[i];
            if(output.containsKey(str)){
                output.put(str,output.get(str)+1);
            }
            else{
                output.put(str,1);
            }
        }

        System.out.println(output);

    }

    public static void main(String[] args) {

        String[] ar = {"Apple", "Orange", "Mango", "Apple", "Mango", "Orange", "Orange"};

        printCount(ar);

    }

}
