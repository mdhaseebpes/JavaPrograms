package module3;

public class StringBufferConcept {

    public static void main(String[] args) {

        StringBuffer sb  = new StringBuffer("Interview");
        StringBuffer sb1  = new StringBuffer("Interview Java");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));


        System.out.println(sb +"|Size - " + sb.length() + "|Capacity - " + sb.capacity());
        System.out.println(sb +"|Size - " + sb1.length() + "|Capacity - " + sb1.capacity());
    }
}
