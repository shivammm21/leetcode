/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {

        if(k < 0) return 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

        
        
        int pair = 0;

        for(int key:hm.keySet()){

            if(k == 0){
                if(hm.get(key) > 1) pair++;
            }

            else{

                if(hm.containsKey(key+k)) pair++;
            }
        }

        return pair;
        
    }
}
// @lc code=end

