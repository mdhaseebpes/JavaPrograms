package DataStructure.Array;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/

class Solution15 {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++)
        {
            int diff = target - nums[i];
            if(mp.containsKey(diff))
            {
                int[] res = {mp.get(diff), i}; 
                return res;
            }
            mp.put(nums[i], i);
            
        }
        
        return null;
        
    }
}