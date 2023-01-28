package udemy;

public class SumChallenge {

    public static void main(String[] args) {
        int count =0;
        int sum1 =0;
        for(int i=2; i<1000;i++){
            if((i%3==0) && (i%5==0)){
                count++;
                sum1 +=i;
                System.out.println(i);
            }
            if(count==5)
            {
                System.out.println("Sum of numbers that are divided by 3 & 5 -- " + sum1);
                break;
            }
        }
    }
}
