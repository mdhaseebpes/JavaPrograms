package udemy;

public class PalindromRecursion {

    public static boolean isPalindrome(String str)
    {
        if(str == null)
        {
            return false;
        }

        if(str.length()<=1)
        {
            return true;
        }

        String firstLetter =  str.substring(0,1);
        System.out.println(firstLetter);
        String lastLetter  = str.substring(str.length()-1);
        System.out.println(lastLetter);
        if(!firstLetter.equals(lastLetter))
        {
            return false;
        }
        else{
            return isPalindrome(str.substring(1,str.length()-1));
        }
    }

    public static void func(int n){
       int i=0;
       int sum=0;
       while(i<100){
           sum = sum+i;
           sum =i+sum;
           i+=1;
       }
        System.out.println(sum);
    }

    public static int fib(int n){
      if(n<=1){
          return n;
      }
      return fib(n-1) + fib(n-2);

    }


    public static int fib(int A, int B){
        if(B==0){
            return A;
        }
        else
        return fib(B, A%B);

    }

    public static void main(String[] args) {

        String str = "racecar";
        boolean check =isPalindrome(str);
        System.out.println(str + " IsPalindrome " + check);

       func(4);
      int result = fib(6);
        System.out.println(result);

        int ans = fib(100, 2000);
        System.out.println(ans);
    }
}
