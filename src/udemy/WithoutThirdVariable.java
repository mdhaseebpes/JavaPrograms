package udemy;

public class WithoutThirdVariable {

    public static void main(String[] args) {
        System.out.println("--- without third variable------");

        int num1 = 40;
        int num2 = 90;

        num1= num1+num2; //130
        num2 = num1-num2; //130-90 = 40
        num1 = num1-num2; //130-40=90

        System.out.println("num1 value is " + num1 + "\n" + "num2 value is " + num2);

        String s1 = "do";
        String s2 = "die";

        s1 = s1+s2;
      s2 = s1.substring(0,s1.length()-s2.length());
      s1 = s1.substring(s2.length());

        System.out.println("s1 value is " + s1 + "\n" + "s2 value is " + s2);
    }
}
