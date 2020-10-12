package module3;

public class StringConcept {

    public static void main(String[] args) {

        String str  = "Aliza";
        String str1 = "Aliza";

        System.out.println(str==str1);
        System.out.println(str.equals(str1));

        str.concat("Fathima");
        System.out.println(str);

        str = str.concat(" Fathima");
        System.out.println(str);

        String str2 = new String("Java");
        String str3 = new String("Java");

        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));






    }

}
