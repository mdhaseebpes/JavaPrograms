package DataStructure;

import java.util.Scanner;
class KadanesAlgo{  

    public static int kadanes(int arr[])
    {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0)
            {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]){  
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }*/
        int[] arr = {30,50,70,90,10};
        int result = kadanes(arr);
        System.out.println(result);
    }  
}  