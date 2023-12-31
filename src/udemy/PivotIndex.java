package udemy;


class PivotIndex {

    public static int pivot(int[] arr){
        int n = arr.length;
        int rightSum =0;
        int leftSum =0;

        for(int i=0;i<n;i++){
            rightSum+= arr[i];

        }
        System.out.println("Right sum is  " + rightSum);
        for(int i=0;i<n;i++){
            rightSum = rightSum-arr[i];
            if(rightSum==leftSum) {
                System.out.println(arr[i]);
                return i;
            }
            leftSum= leftSum + arr[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,1,5,3,15};
        int[] arr1 = {2,5,3,1,-3,20,-7};
        int result =pivot(arr);
        System.out.println("Pivot index is " + result);
    }
}  