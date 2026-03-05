/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
 */

// @lc code=start
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] res = new ListNode[k];

        int len = 0;

        ListNode curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        curr = head;

        int size = len/k;
        int remainder = len % k;

        for(int i=0;i<k;i++){

            res[i] = curr;

            int partSize = size + (i < remainder ? 1:0);

            for(int j=0;j<partSize-1 && curr != null;j++){
                curr = curr.next;
            }

            if(curr != null){

                ListNode next = curr.next;
                curr.next = null;

                curr = next;
            }
        }

        return res;
        
    }
}
// @lc code=end

