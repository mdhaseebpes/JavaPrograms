package module3;

public class StringBufferConcept {

    public static void main(String[] args) {

        StringBuffer sb  = new StringBuffer("Interview Java");
        StringBuffer sb1  = new StringBuffer("Interview Java");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

        String hello = new String("New");
        String hello1 = new String("New");
        System.out.println("***********************");
        System.out.println(hello==hello1);
        System.out.println(hello.equals(hello1));

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("*****************************************************");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(sb +"|Size - " + sb.length() + "|Capacity - " + sb.capacity());
        System.out.println(sb +"|Size - " + sb1.length() + "|Capacity - " + sb1.capacity());
    }
}
