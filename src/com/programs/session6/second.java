package com.programs.session6;

 public class second  extends  first{

    public void color(){
         System.out.println("second class");
     }

     public void paint(){
         System.out.println("second class paint");
     }
     public static void main(String[] args) {
        second s1 = new second();
        s1.color();

        first f = new second();
        f.color();
        f.brush();

        second s2 = (second)f;
        s2.brush();
        s2.paint();
     }
}
