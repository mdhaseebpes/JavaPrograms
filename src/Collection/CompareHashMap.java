package Collection;

import java.util.HashMap;

public class CompareHashMap {

    public static void main(String[] args) {
        HashMap<String,String> map1 = new HashMap<>();

        map1.put("CONFIDENTIAL USER2","PREFERRED MEMBER,");
        map1.put("CHEN H L0","PREFERRED MEMBER,");
        map1.put("CONFIDENTIAL USER1","PREFERRED MEMBER,");
        map1.put("LIN TUNG YU4","PREFERRED MEMBER,");
        map1.put("CONFIDENTIAL USER3","PREFERRED MEMBER,");

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("CONFIDENTIAL USER1","PREFERRED MEMBER,");
        map2.put("CONFIDENTIAL USER2","PREFERRED MEMBER,");
        map2.put("CHEN H L0","PREFERRED MEMBER,");
        map2.put("LIN TUNG YU4","PREFERRED MEMBER,");
        map2.put("CONFIDENTIAL USER3","PREFERRED MEMBER,");

        System.out.println(map1);
        System.out.println(map2);

        System.out.println(map1.equals(map2));

    }
}
