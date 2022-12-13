package DataStructure;

import java.lang.reflect.Array;

public class PivotIndex {

    public static int pivot(int[] arr){
        int n = arr.length;
        int rightSum=0;
        int leftSum=0;

        for(int i=0;i<n;i++){
            rightSum+=arr[i];
        }
        System.out.println("total sum of array " + rightSum);

        for(int j=0;j<n;j++){
            rightSum = rightSum-arr[j];
            if(rightSum==leftSum){
                return j;
            }
            else {
                leftSum = leftSum +arr[j];
            }
        }
    return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,5,3,5,1,-3,20,-5,-7};
       int result = pivot(arr);
        System.out.println("Pivot index is  " + result);

        System.out.println("**********************");
        int[] arr1 = {2,5,3,1,-3,20,-7};
        int result1= pivot(arr1);
        System.out.println("Pivot index is  " + result1);

    }
}
