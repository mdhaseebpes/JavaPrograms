package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> number  = new ArrayList<Integer>(Arrays.asList(1,2,1,3,2,5,6,7,5,8,7,4,1));

        //LinkedHashset

        LinkedHashSet<Integer> linknumber = new LinkedHashSet<>(number);

        ArrayList<Integer> noDuplicate = new ArrayList<Integer>(linknumber);
        System.out.println(noDuplicate);

        //JDK 8 Stream

        ArrayList<String> names  = new ArrayList<String>(Arrays.asList("Haseeb", "Alfi" ,"Aliza","Waiz","Haseeb", "Alfi" ,"Aliza","Waiz"));
        List<String> namesNoDuplicate = names.stream().distinct().collect(Collectors.toList());

        System.out.println(namesNoDuplicate);

    }

}
