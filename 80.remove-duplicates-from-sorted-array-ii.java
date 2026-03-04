/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0;

        int i = 1;

        //1 1 2 2 3 3
        //        j
        //            i

        while(i<nums.length){

            if(nums[i] == nums[j]){

                if(i+1<nums.length && nums[i+1] == nums[j]){

                    i++;

                }else{

                    j++;

                    nums[j] = nums[i];

                    i++;

                }

            }else{

                j++;

                nums[j] = nums[i];

                i++;

            }

        }
        return j + 1;
    }
}
// @lc code=end

