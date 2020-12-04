package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        List<String> names = Collections.synchronizedList(new ArrayList<String>());

        names.add("Java");
        names.add("Python");
        names.add("Ruby");
        names.add("wrong");

        names.remove(3);

        //to add ,remove -- we dont need explicit synchronization

        // to traverse/fetch the values from the list - we need explicit synchronization

        synchronized (names) {
            Iterator<String> it = names.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //2. copyOnWriteArrayList - its a class
        CopyOnWriteArrayList<String> emp = new CopyOnWriteArrayList<String>();

        emp.add("Tom");
        emp.add("Steve");
        emp.add("AA");

        //we dont need explicit synchronization for any operation : add/remove/traverse

        Iterator<String> it  = emp.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
