package Collection;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<String>();

        ar1.add("Test");
        ar1.add("Application");
        ar1.add("with automation");

        System.out.println(ar1);

        System.out.println("********************");
       ArrayList<String> clonelist = (ArrayList<String>)ar1.clone();

        System.out.println(clonelist);
    }
}
