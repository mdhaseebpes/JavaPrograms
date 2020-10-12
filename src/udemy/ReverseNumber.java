package udemy;

public class ReverseNumber {

    public static void main(String[] args) {

        int i  = 7654321;
        String s = Integer.toString(i);
        String t = "";


        for(int j=s.length()-1;j>=0;j--){
           t = t+s.charAt(j);
        }

        System.out.println(t);
       int k= Integer.parseInt(t);
        System.out.println("Reverse number is " + k);
    }
}
