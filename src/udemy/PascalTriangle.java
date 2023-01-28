package udemy;

public class PascalTriangle {

    public static void main(String[] args) {

        int no = 4;
        int spaces = no;

        for(int i=0;i<no;i++)
        {
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<=i; j++)
            {
                System.out.print(number+ " ");
                number = number * (i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }

    }
}
