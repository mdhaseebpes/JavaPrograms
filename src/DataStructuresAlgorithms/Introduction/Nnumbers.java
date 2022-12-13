package DataStructuresAlgorithms.Introduction;

public class Nnumbers {
    public static void main(String[] args) {
        System.out.println("n numbers -- 1st approach");
        int input  = 3;
        int temp=0;
        for(int i=1; i<=input;i++){
            temp =  i + temp;

        }
        System.out.println("sum of n numbers for " + input + "--" + temp);

        System.out.println("n numbers -- 2nd approach");
        int sum=0;
        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                sum++;
            }
        }
        System.out.println("sum of n numbers for " + input + " -- " + sum);

        System.out.println("n numbers -- 3rd approach");
         int value = input*(input+1)/2;
        System.out.println("sum of n numbers for " + input + "-- " + value);
    }
}
