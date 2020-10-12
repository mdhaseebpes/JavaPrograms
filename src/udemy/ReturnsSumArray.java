package udemy;

public class ReturnsSumArray {


    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sumofArray = ReturnsSumArray.sumArray(a);
        System.out.println("Total sum of Array " + sumofArray);

    }
}
