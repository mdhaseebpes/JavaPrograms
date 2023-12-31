package udemy;


import java.util.Arrays;

public class BinarySearch {

    public static int BinarySearch(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            } else if (arr[mid]<x) {
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by comma");
        String input  = scanner.nextLine();

      String[] strArr =  input.split(",");

        int[] arr1 = new int[strArr.length];
        for(int i=0; i< arr1.length;i++){
            arr1[i]=Integer.parseInt(strArr[i]);
        }
*/
        int[] arr1 = {77, 33, 44, 12, 4, 79, 90, 34,55};
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        int index =  BinarySearch(arr1, 4);
        System.out.println("index is " + index);
    }
}

