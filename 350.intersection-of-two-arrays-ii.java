/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums1.length;i++) 
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);

        for(int i=0;i<nums2.length;i++){

            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0){

                res.add(nums2[i]);

                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }

        int[] r = new int[res.size()];
        int i=0;

        for(int num:res) r[i++] = num;

        return r;        
    }
}
// @lc code=end

