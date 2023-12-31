package lambdaExpression;


@java.lang.FunctionalInterface
interface Cab {
     void m1();

    default void m2(){
        System.out.println("default method");
    }

    static void m3(){
        System.out.println("static method");
    }

    // void m4(); --->not allowed in functional interface only 1 abstract is allowed
}

interface  Cab1{
    void bookCab(String source, String destination);
}

interface  Cab2{
    public String bookCab1(String source , String destination);
}

/*class Ola implements Cab ,Cab1 ,Cab2{

  *//*  public void m1(){
        System.out.println("Ola cab is booked......");
    }
    *//*

       public void bookCab(String source , String destination){
            System.out.println("Ola cab is booked " +source+ " To " + destination);
       }

        public String bookCab1(String source , String destination){
            System.out.println("Ola cab is booked " +source+ " To " + destination);
            return(""Price :500 rs ");
       }

}*/
public class FunctionalInterface {

    /**
     * Functional Interface contains 1 abstract method
     * Any number of default and static methods
     *  Examples of functional interface containing only 1 abstract method
     *  1. Runnable ----> run()
     *  2. Callable ----> call()
     *  3. Comparable ---> compareTo()
     *  4. ActionListener ----> actionPerformed()
     *
     * Without functional interface lambda function cannot be invoked
     */


    public static void main(String[] args) {

        Cab c = () -> System.out.println("Ola cab is booked.....");
        c.m1();

        Cab1 c1 = (String source, String destination) -> System.out.println("Ola cab is booked from " + source + " To " + destination);
        c1.bookCab("Bangalore", "Kashmir");

        Cab1 c2 = (source, destination) -> System.out.println("Ola cab is booked from " + source + " To " + destination);
        c2.bookCab("Bangalore", "Kashmir");

        Cab2 c3 = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + " To " + destination);
         return ("Price :500 rs");
        };
        c3.bookCab1("Bangalore" ,"Poland");
    }
}
