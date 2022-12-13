package udemy;

public class getEvenSum {

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int digit=0;
        while(number>0){
           int even = number%10;
           if(even%2==0){
               sum+=even;
           }
           digit = even + digit*10;
           number/=10;
        }
        return  sum;
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
