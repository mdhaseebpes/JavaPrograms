package Arrays;

import java.util.Scanner;

public class MinArray {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){
        int[] intA = new int[count];
        for(int i=0;i<intA.length;i++){
            System.out.println("enter a number :" + (i+1));
            int number = scanner.nextInt();
            intA[i] = number;
        }

        return intA;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            int value = arr[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int value= arr[i];
                    if(value>max){
                        max =value;
                    }
        }
        return max;
    }


    public static void main(String[] args) {

       int[] returnArray = readIntegers(5);
      int min = findMin(returnArray);
        System.out.println("minimum number is " + min);

        int max = findMax(returnArray);
        System.out.println("maximum number is " + max);
    }
}
