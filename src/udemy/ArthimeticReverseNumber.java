package udemy;

public class ArthimeticReverseNumber {

    public static void main(String[] args) {

        int a = 5678;
        int reverse =0;

        while(a!=0)
        {
          int digit = a%10;//8
          reverse = digit+ reverse*10;  //5
           a=a/10;
        }

        System.out.println("Reverse number is " + reverse);

    }
}
