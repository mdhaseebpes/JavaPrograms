package Collection.javaCollection23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("test");
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(true);
        arrayList.add(12.33);
        arrayList.add('a');

        System.out.println(arrayList.size());
        System.out.println("LI = " + 0);
        System.out.println("HI = " + (arrayList.size() - 1));

        arrayList.add(600);
        arrayList.add(1);

        System.out.println(arrayList.size());


        //Iterate
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("QA");
        list.add("QA");
        list.set(1, "C");

        //for loop
        System.out.println("Using for loop -------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for each -------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Using lambda -------");
        list.stream().forEach(ele -> System.out.println(ele));

        System.out.println("Using Iterator ---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("list with collections --");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(20, 30, 50, 60));

        System.out.println(numbers.size());

        numbers.stream().forEach(e -> System.out.println(e));


    }
}
