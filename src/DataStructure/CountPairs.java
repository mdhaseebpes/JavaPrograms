package DataStructure;

public class CountPairs {

    public static int countPair01(int[] arr ,int target){
        int n = arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair numbers are  " + arr[i] + " " +arr[j]);
                    count++;
                }
            }
        }
        return count==0 ?-1:count;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,9,15,20,34,35,40,14};
        int target = 49;

        System.out.println(countPair01(arr,target));
    }
}
