package Arrays;

public class SumAverage {

    public static double sumAverage(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Total sum  is " + sum);
        double average = (double) sum/2;
        return average;
    }

    public static void main(String[] args) {
        int[] arr = {22,33,4,5,52,11};
        System.out.println("Average number is : " + sumAverage(arr));
    }
}
