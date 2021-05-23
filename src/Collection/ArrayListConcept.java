package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListConcept {

    /**
     * Dynamic array: No fixed size
     * Allows Duplicate values
     * Insertion happens in order on the base of Indexes
     * Can access random values as it stores values on the base of index
     *  In order to access the values from Array list can use - for loop and Iterator
     */

/*
    ARRAYLIST	LINKEDLIST-
    ARRAYLIST- This class uses a dynamic array to store the elements in it. With the introduction of generics,this class supports the storage of all types of objects.
    LINKEDLIST-This class uses a doubly linked list to store the elements in it. Similar to the ArrayList, this class also supports the storage of all types of objects.

    ARRAYLIST -Manipulating ArrayList takes more time due to the internal implementation. Whenever we remove an element, internally, the array is traversed and the memory bits are shifted.
    LINKEDLIST-Manipulating LinkedList takes less time compared to ArrayList because, in a doubly-linked list, there is no concept of shifting the memory bits. The list is traversed and the reference link is changed.

    ARRAYLIST -This class implements a List interface. Therefore, this acts as a list.
    LINKEDLIST-This class implements both the List interface and the Deque interface. Therefore, it can act as a list and a deque.

    ARRAYLIST-   This class works better when the application demands storing the data and accessing it.
    LINKEDLIST-This class works better when the application demands manipulation of the stored data.
*/

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("B");
        ll.add("QA");
        ll.add("QA");

        System.out.println(ll);


        Employee emp = new Employee("A" ,1 ,"QA");
        Employee emp1 = new Employee("B" ,2 ,"Dev");
        Employee emp2 = new Employee("C" ,3 ,"Admin");

        ArrayList<Employee> ar = new ArrayList<Employee>();

        ar.add(emp);
        ar.add(emp1);
        ar.add(emp2);

    Iterator<Employee> i=  ar.iterator();
    while(i.hasNext()){
      Employee e =  i.next();
        System.out.println(e.name + " " + e.age  + " " + e.dept) ;
    }


    ArrayList<String> list  = new ArrayList<String>();

    list.add("A");
    list.add("B");
        list.add("QA");
        list.add("QA");
        System.out.println(list);
        list.set(1,"C");
        System.out.println(list);

        System.out.println("************** for loop");

        for(int j=0; j<list.size();j++)
        {
            System.out.println(list.get(j));

        }

        System.out.println("******************** for each");
        for(String e :list)
        {
            System.out.println(e);
        }

        System.out.println("************  Iterator");

        Iterator<String> l = list.iterator();

        while(l.hasNext())
        {
           String s =  l.next();
            System.out.println(s);
        }

        System.out.println("************************ streams with lambda");

        list.stream().forEach(ele -> System.out.println(ele));


        Iterator<String> l1 = list.iterator();
        while (l1.hasNext())
        {
            String s =l1.next();
            System.out.println(s);
        }

    }
}
