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

        System.out.println("***********************************");
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));

        System.out.println("***********************************");
        String qa = "https://qa.healthfusionclaims.com/electronic/userlogin.jsp";
       // qa.startsWith("https","electronic/");
        qa.replaceFirst("electronic/","electronic/userlogin.jsp");
        System.out.println(qa);

        System.out.println("*****************TEST******************");

        String s4 = "Test";
        String s5 = "Test";

        String s6 = new String("Test");
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));

        System.out.println("*********New*********");
        System.out.println(s4==s6);
        System.out.println(s4.equals(s6));

        String st = "test[80]";
          String st4 = st.replaceAll("[0-9]","");
        System.out.println(st4);
        System.out.println(charRemoveAt(st, 6));



    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
