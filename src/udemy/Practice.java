package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

      public static void main(String args[]) {
          System.out.println("**********");

          for(int i =1;i<=5;i++)
          {
              for(int j=1;j<=i;j++)
              {
                  System.out.print(i + " ");
                  System.out.print("\t");
              }
              System.out.println();
          }

          System.out.println("**********");
      }
    }
}
