package udemy;

public class PrintNumberOnly {

    public static void main(String[] args) {
        String s="oraclE9.9",t="java6.7";
        s=s.replaceAll("[a-zA-Z]","");
        t=t.replaceAll("[a-zA-Z]","");
        Float val1=Float.parseFloat(s);
        Float val2=Float.parseFloat(t);
        System.out.println("output: " +val1 + " " + val2);


        String s2 = "Abb%^&*5.5QA";

        s2 = s2.replaceAll("[a-zA-Z]","");
        Float value = Float.parseFloat(s2);
        System.out.println(value);
    }
}
