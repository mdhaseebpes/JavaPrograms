package Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a + " ");
        }

}

public static void descArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
}

    public static void main(String[] args) {

        int[] arr = {22,4,55,5,12,33,3};
        reverseArray(arr);
        System.out.println();
        descArray(arr);
    }
}

