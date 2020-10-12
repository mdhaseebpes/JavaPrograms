package udemy;

public class DistinctElements {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 4, 5, 3, 4, 4, 5, 5, 5, 6, 9, 6};



       for(int i=0;i<nums.length;i++)
       {
           Boolean isDistinct = false;
           for(int j=0;j<i;j++)
           {
               if(nums[i] == nums[j])
               {
                   isDistinct = true;
                   break;
               }
           }

           if(!isDistinct)
           {
               System.out.print(nums[i] + " ");
           }
       }
    }
}
