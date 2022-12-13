package com.programs.session6;

class Animal{
    final String s1 = "first class";

}

class Mammal extends Animal{




}

public class TestClass  extends Mammal{



    public static void main(String[] args) {

        //upcasting

        Animal a1  = new Animal();
        System.out.println(a1.s1);

        Mammal a2 = new Mammal();
        System.out.println(a2.s1);
      //  a2.s1 = "second class";

        System.out.println(a2.s1);


       Mammal m1 = new TestClass();

       Animal a3  = new Mammal();

       Animal a4 = new TestClass();

       //downcasting -- only upcasted objects can be downcasted

        TestClass t1 = (TestClass)m1;
        Mammal t2  = (Mammal)a3;
        TestClass t3 = (TestClass)a4;






    }
}
