package udemy;

public class StringWithoutVariables {

    public static void main(String[] args) {

        String s="Cucumber9.9xX",t="Appium6.7xxVersion";
        s=s.replaceAll("[a-zA-Z]","");
        t=t.replaceAll("[a-zA-Z]","");
        Float val1=Float.parseFloat(s);
        Float val2=Float.parseFloat(t);
        float result  = val1 + val2;
        System.out.println("output:" + result);

        //Swap without using 3 variable
        String a="oraclE9.9",b="java6.7";

        System.out.println("Before swap a = " + a + " b = " + b );

        a = a + b;
        b= a.substring(0,(a.length()- b.length()));
        a = a.substring(b.length());

        System.out.println(" --After swap-------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String c = "Automation" , d = "Test";
        c = c + " " + d;
        System.out.println("Before swap c = " + c + " d = " + d );

        String[] e =  c.split("\\s");
        d = e[0];
        c = e[1];

        for (String x : e){
            System.out.println(x);
        }

        System.out.println("After swap c = " + c + " d = " + d );

        int num1 = 10;
        int num2 = 14;

        System.out.println("Before swap num1 = " + num1 + " num2 = " + num2 );
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(" --After swap-------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
