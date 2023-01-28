package com.programs.session6;

/**
 * In general, in overriding, the method in a superclass and
 * subclass have the same name and, parameters. But,
 * when it comes to returning type, the method in the subclass can return
 * the subtype of the return type of the method in the superclass.
 */
class Test {
    int data = 100;

    Test demoMethod() {
        return this;
    }
}

public class Covariant extends Test {


    int data = 1000;

    Covariant demoMethod() {
        return this;
    }

    public static void main(String args[]) {
        Covariant sam = new Covariant();
        System.out.println(sam.demoMethod().data);
    }
}
