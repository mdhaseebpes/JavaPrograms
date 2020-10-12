package udemy;

public class MultiDimesionalMax {

    /**
     * 2 14 25
     * 23 14 17
     * 11 112 19
     */
    public static void main(String[] args) {

        int[][] a = {{2,14,25},{23,14,17},{11,112,19}};
        int max = a[0][0];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]>max)
                {
                   max= a[i][j];
                }
            }
        }

        System.out.println("Maximum number in matrix " + max);
    }
}
