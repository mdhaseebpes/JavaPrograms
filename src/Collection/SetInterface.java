package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

   /* The set is an interface available in the java.util package. The set interface extends the Collection interface.
    An unordered collection or list in which duplicates are not allowed is referred to as a collection interface.
    The set interface is used to create the mathematical set. The set interface use
        collection interface's methods to avoid the insertion of the same elements.
    SortedSet and NavigableSet are two interfaces that extend the set implementation.*/

    //Does not maintain Order
    //we can use for each for iteration
    //can use Iterator
    // can do union,intersection(using retainAll) ,difference(using removeALL)

    //Hashset uses hashMap internally
    //http://www.docjar.com/html/api/java/util/HashSet.java.html
    public static void main(String[] args) {


        Set<String>  hs = new HashSet<String>();
        hs.add("Testing");
        hs.add("Training");
        hs.add("Training");
        hs.add("Selenium");
        hs.add(null);

        System.out.println(hs);

        System.out.println(hs.contains("Training"));

        for(String e: hs){
            System.out.println(hs);
        }

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[]{1,3,6,8,0}));


        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[]{1,2,6,8,0,4}));

        Set<Integer> union = new HashSet<Integer>(first);
        second.addAll(second);
        System.out.println(union);

    }
}
