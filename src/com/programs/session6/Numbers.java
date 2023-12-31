package com.programs.session6;

import java.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

 class Numbers extends  TestClass{

     public void color(){

    }

    public static  void main(String[] args)
    {
       int[] max  = {23,44,55,77,88,99,111};

       int diff = 0;
       for(int i=1; i<max.length;i++) {
           if (max[i] - max[i - 1] > diff) {
               diff = max[i] - max[i - 1];
           }
       }
           System.out.println("Maximum difference is " + diff);

           System.out.println("Anagram Program *******************");
           String s1 = "tops";
           String s2 = "stop";

           char[] s3 = s1.toLowerCase().toCharArray();
           char[] s4 = s2.toLowerCase().toCharArray();

           Arrays.sort(s3);
           Arrays.sort(s4);
           if(Arrays.equals(s3,s4))
           {
               System.out.println("It is Anagram");
           }
           else{
               System.out.println("Not a Anagram");
           }

        System.out.println("Reverse a String and Number ***********");
           String a1 = "Teacher";
           String t = "";
           for(int i=a1.length()-1;i>=0;i--){
               t= t+a1.charAt(i);
           }

        System.out.println("Reverse String is " + t);

           int b = 45678;
         String c =  String.valueOf(b);
         String d ="";
         for(int i=c.length()-1;i>=0;i--){
             d = d+ c.charAt(i);
         }
       b =  Integer.parseInt(d);
        System.out.println("Reverse number is  " + b);

        System.out.println("Reverse number*******************");
        int j = 23456;
        int reverse =0;
        while(j>0){
            int k = j%10;
            reverse = k+ reverse*10;
            j = j/10;
        }
        System.out.println("Reverse number is  " + reverse);

        System.out.println("Binary Search **********************");

        int[] list  = {23,44,55,77,88,99,111};
        int search = 111;
        boolean flag  = false;
        int h=0;
        int l = list.length-1;
        while(h<=l){
            int mid = (l+h)/2;
            if(list[mid]==search){
                System.out.println("Search number is present at  index " + (mid+1) + " " +search);
                flag= true;
                break;
            }else if(search<list[mid]){
                l = mid-1;

            }
            else{
                h = mid+1;
            }
        }

        int a[] = {1, 3, 4, 55, 6, 34, 23, 21, 5, 6};
        System.out.println("Un-sorted array " + Arrays.toString(a));//print array

         int sizeA = a.length-1;
         for(int i=0;i<sizeA;i++){
             for(int k=0;k<sizeA;k++){
                 if(a[k]>a[k+1]){
                     int temp = a[k];
                     a[k] = a[k+1];
                     a[k+1] = temp;
                 }
             }
         }
        System.out.println("Sorted Array is " + Arrays.toString(a));
    }
}
