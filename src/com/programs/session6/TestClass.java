package com.programs.session6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

class Animal{

}

class Mammal extends Animal{




}

public class TestClass  extends Mammal{



    public static void main(String[] args) {

        //upcasting

       Mammal m1 = new TestClass();

       Animal a1  = new Mammal();

       Animal a2 = new TestClass();

       //downcasting -- only upcasted objects can be downcasted

        TestClass t1 = (TestClass)m1;
        Mammal t2  = (Mammal)a1;
        TestClass t3 = (TestClass)a2;




    }
}
