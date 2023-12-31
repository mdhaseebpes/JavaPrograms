package udemy;

public class MovesZeroToEnd {

    public static void move(int[] arr) {
        int n = arr.length;
        int j = 0;
        int i = 0;

        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 4, 22, 0, -1, 66, 0, 2, 0, 1};

        move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
