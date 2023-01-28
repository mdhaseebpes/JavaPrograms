package udemy;

public class PrintNumberOnly {

    public static void main(String[] args) {
        String s="oraclE9.9",t="java6.7";
        s=s.replaceAll("[a-zA-Z]","");
        t=t.replaceAll("[a-zA-Z]","");
        Float val1=Float.parseFloat(s);
        Float val2=Float.parseFloat(t);
        System.out.println("output: " +val1 + " " + val2);


        String s2 = "Abb5.5QA";
        String s3 = "!@#4.5";

        s2 = s2.replaceAll("[a-zA-Z]","");
        s3 = s3.replaceAll("[!@#]","");

        Float value = Float.parseFloat(s2);
        Float value1 = Float.parseFloat(s3);
        System.out.println(value+value1);
    }
}
