package udemy;

public class SumOddRange {

    public  static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2!=0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start ,int end){
        int sum =0;
        if((start<0) || (end<0) ||(start>end)){
            return -1;
        }

        for(int i=start;i<=end;i++){

            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number){
        if(number<0){
            return false;
        }
        if(number%2==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(10,5));
        System.out.println(isEvenNumber(7));
        System.out.println(isEvenNumber(8));
    }
}
