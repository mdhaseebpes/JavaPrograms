package Selenium;

public abstract class AbstractInterfaceInfo {
    /**
     * Note:
     -	An abstract class can have any number of abstract method as well as concrete methods or only concrete methods or only abstract method
     -	If a class contains at least one abstract method, then that class should be declared as abstract
     -	An abstract class cannot be instantiated. It means we cannot create an object for abstract class
     -	An abstract class should be extended to the subclass. The sub class should implement all methods (abstract) or else the subclass also should be declared as abstract class
     -	Whenever we use abstract methods the abstract methods should be completed/overridden in the subclass
     -	It can contain only non-static abstract methods
     -	It can contain both static and non-static concrete methods
     -	It can contain both static and non-static variables
     -	It can have constructor which will be invoked when concrete subclass object is created
     -	It can have static and non-static final variables

     */


    /**
     * Interface is a type/definition block which contains only abstract methods
     * It is like 100 % abstract class
     * -	An interface type starts with keyword interface
     * -	A java file can contain only interface definition block
     * After compilation of interface definition block compiler generated class file for the interface
     * -	Java file can have both class definition block and interface definition block
     * -	Inside interface definition block, concrete methods are not allowed.
     * -	The interfaces should contain only abstract methods (that too non static)
     * -	By default the methods in interface are abstract and public
     * -	Other than public access specifier we cannot use other access specifier
     * -	All variables in an interface must be public, static and final. i.e. it can declare only constants and it should be initialized at the declaration time
     * -	A method cannot be declared as static in interface
     * -	A class cannot extend more than I class (java doesn’t support multiple inheritance) but a class implement more than one interface
     * -	We cannot instantiate an interface
     * -	An interface can extend one or more other interfaces
     * -	An interface cannot extend anything other than interface
     * -	An interface cannot implement another interface or class
     */

    /**
     * Difference between abstract Class & Interface
     * •	An abstract class should be declared with the keyword abstract.
     * interface starts with keyword interface and by default is abstract
     * •	The abstract class can contain both concrete and abstract methods.
     * The interface contains only abstract methods.
     * •	In abstract class the method should be explicitly declared as abstract
     * In interface by default all the methods are abstract
     * •	In abstract class we can use all the access specifier except private.
     * In interface we can use only(default) public access specifier
     * •	An abstract class abstract methods are non static and concrete methods can contain static & non static
     * Interface should have only non static methods
     * •	A class can extend an abstract class, but a class should implement an interface
     * •	A class cannot extend two abstract class at a time but an interface can extend one or more interfaces
     * •	A class can extend only one class implement multiple interfaces
     * •	In abstract class we can have static,non static and final variables and in interface we can have only final variables(public ,static and final)
     * •	In an abstract class if a concrete method is added, the subclasses will not be affected and will be affected only when you add an abstract method
     * In interface if you add a new method then all the classes which implements the interface will break(fail)
     */

    abstract void draw();
   //Cannot create abstract static methods
  // abstract  static void paint();

    final void da(){

    }

    AbstractInterfaceInfo()
    {
        System.out.println("abstract call constructor");
    }

    public static void main(String[] args) {


    }
}
