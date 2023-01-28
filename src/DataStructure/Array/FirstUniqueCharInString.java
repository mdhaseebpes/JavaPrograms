package DataStructure.Array;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution11 {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(mp.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        
        return -1;
        
    }
}