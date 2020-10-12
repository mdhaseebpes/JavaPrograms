package udemy;

import java.util.Scanner;

public class Multiplication {

    public static void table(int number) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + number;
            System.out.println(number + " * " + i + " = " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);

        Multiplication.table(number);
    }
}
