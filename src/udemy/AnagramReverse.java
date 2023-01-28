package udemy;

import java.util.Arrays;
public class AnagramReverse {

    static int show(){
        try{
            int i= 5/0;
           return 1;
        }catch(Exception e){
            return 2;
        }finally {
            return 3;
        }

    }

    public static void main(String[] args) {

       int result = show();
        System.out.println(result);

        String str1 = "stop";
        String str2 = "tops";

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Strings are Anagram");
        }
       else
       {
           System.out.println("Strings are not Anagram");
       }



    }
}
