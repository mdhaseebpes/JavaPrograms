package udemy;

import java.util.Scanner;

public class PrimeNumber {
    //a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
    public static void primeNumberCheck(int number)
    {
        boolean flag=false;
        for(int i=2;i<number;i++)
        {
            if(number%i==0){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("It is not a Prime Number");
        else
        {
            System.out.println("It is a Prime Number");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();

        PrimeNumber.primeNumberCheck(number);
    }
}
