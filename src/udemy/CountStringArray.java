package udemy;

import java.util.LinkedHashMap;
import java.util.Map;

 public class CountStringArray {

     protected  String name = "A";

     public CountStringArray() {
     }

     protected void dummy(){
         System.out.println("test");
     }


    public void printCount(String[] ar){

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

         CountStringArray countStringArray = new CountStringArray();


        String[] ar = {"Apple", "Orange", "Mango", "Apple", "Mango", "Orange", "Orange"};

        countStringArray.printCount(ar);

    }

}
