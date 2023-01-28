package udemy;

public class PyramidPattern {

      static  int  n =5;
    static int num = 1;
        public static void main(String args[]){

            // n in this case
            for(int i=0; i<n; i++)
            {

                // without re assigning num
                if(num==10) {
                    break;
                }
                for(int j=0; j<=i; j++)
                {
                    // printing num with a space

                        System.out.print(num + " ");

                        // incrementing num at each column
                        num = num + 1;



                }

                // ending line after each row
                System.out.println();
            }
        }
    }
