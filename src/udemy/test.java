package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class test{

    public static void main(String[] args) {



        int[] zeros = {33,66,0,53,0,43,11,0,31,9,10,01,0};

        int n = zeros.length;
        int i=0;
        int j=0;
        while(i<n){
            if(!(zeros[i]==0)){
                int temp = zeros[i];
                zeros[i]= zeros[j];
                zeros[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(zeros));

        System.out.println("-------count String ----------");
        String s1 = "Automation JOB needed desperately";
        String w = s1.replaceAll(" ","").toLowerCase();

        ArrayList<Character> list = new ArrayList<>();

        for(int a=0;a<w.length();a++){
            int count =0;
            if(!(list.contains(w.charAt(a)))){
                list.add(w.charAt(a));
                count++;

                for(int b=i+1;b<w.length();b++){
                    if(w.charAt(a)==w.charAt(b)){
                        count++;
                    }
                }

                System.out.println("Character " + w.charAt(a) + " is repeated = " + count);
            }

        }

        System.out.println("----- Count Array String ----------");
        String[] ar = {"Apple", "Orange", "Mango", "Apple", "Mango", "Orange", "Orange"};

        Map<String,Integer> map = new LinkedHashMap<>();

        for(int c =0;c<ar.length;c++){
            String str = ar[c];
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        System.out.println(map);

        System.out.println("----- Sort  Array  ----------");
        int[] s2 = {55,6,23,7,11,3214,21,121,221};

        for(int d=0;d<s2.length-1;d++){
            for(int e=0;e<s2.length-1;e++){
                if(s2[e]>s2[e+1]){
                    int temp = s2[e];
                    s2[e] = s2[e+1];
                    s2[e+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(s2));

        System.out.println("-------Third variable---------");
        int f = 10;
        int g = 30;

        f = f + g; //40
        g = f - g; //10
        f = f - g;//30

        System.out.println("f = " + f );
        System.out.println("g = " + g);

        String h = "do";
        String k = "die";

        h = h+k;
        k= h.substring(0,(h.length()- k.length()));
        h=h.substring(k.length());

        System.out.println("k = " + k);
        System.out.println("h = " + h);

        System.out.println("--------------");
        String l = h + " " + k;
       String[] m = l.split(" ");
       k= m[0];
       h = m[1];

       for(String x :m){
           System.out.println(x);
       }

        System.out.println("After swap h = " + h + " k = " + k );



        String s="Cucumber9.9X",t="Appium6.7Version";
       s = s.replaceAll("[a-zA-z]","");
       t = t.replaceAll("[a-zA-Z]","");

      Float s3 = Float.parseFloat(s);
      Float s4 = Float.parseFloat(t);
        System.out.println(s3+s4);
     }
}
