package udemy;

public class SortArrayDesc {

    public static void descArray(int[] b){

        int temp;
        for(int i=0;i<b.length;i++){

            for(int j=i+1;j<b.length;j++){
                if (b[i] < b[j]) {
                    //swap
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;

                }
            }
        }

        System.out.println("Sorted Array descending");
        for(int c:b)
        {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        int[] b = {44,22,11,88,2,55,77};

        SortArrayDesc.descArray(b);

    }
}
