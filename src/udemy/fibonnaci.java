package udemy;

public class fibonnaci {

    //1 2 3 5 8 13 21

    public static void main(String[] args) {

        int a =0;
        int b = 1;
        int i = 0;
        int sum = 0;
        while (i < 8) {
            sum = a + b;
            a = b;
            b = sum;
            i++;
            System.out.print(sum + " ");
        }

    }
}
