/*
 * @lc app=leetcode id=457 lang=java
 *
 * [457] Circular Array Loop
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean circularArrayLoop(int[] nums) {

        //store index which we visit
        HashSet<Integer> visited = new HashSet<>();

        int i = 0;

        while(i < nums.length){

            if(nums[i] > 0 && !visited.contains(i)){
                visited.add(i);
                i++;
            }
            else{

                if(visited.contains(i)) return true;

                visited.add(i);

                i = Math.abs(nums[i]);
            }

            
        }

        return false;
        
    }
}
// @lc code=end

