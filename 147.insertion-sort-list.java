/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
 */

// @lc code=start

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode insertionSortList(ListNode head) {

        if(head == null) return null;

        ListNode dummy = new ListNode();

        ListNode curr = head;

        while(curr != null){

            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < curr.val){

                prev = prev.next;
            }

            ListNode next = curr.next;

            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
        
    }
}
// @lc code=end

