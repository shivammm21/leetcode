/*
 * @lc app=leetcode id=961 lang=java
 *
 * [961] N-Repeated Element in Size 2N Array
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            if(set.contains(num)) return num;

            set.add(num);
        }

        return -1;
        
    }
}
// @lc code=end

