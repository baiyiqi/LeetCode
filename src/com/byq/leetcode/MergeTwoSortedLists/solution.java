package com.byq.leetcode.MergeTwoSortedLists;

/**
 * Created by yiqibai on 12/18/14.
 */
public class solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode head= new ListNode(0);
        ListNode pt = head;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                pt.next = l1;
                l1 = l1.next;
            }
            else {
                pt.next = l2;
                l2 = l2.next;
            }
            pt = pt.next;
        }

        if(l2 != null)
            pt.next = l2;
        if(l1 != null)
            pt.next = l1;
        return head.next;
    }
}
