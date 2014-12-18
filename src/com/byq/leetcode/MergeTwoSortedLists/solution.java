package com.byq.leetcode.MergeTwoSortedLists;

/**
 * Created by yiqibai on 12/18/14.
 */
public class solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode head = new ListNode(-1);
        ListNode pt = head;
        ListNode pt1;
        ListNode pt2;
        if(l1.val <= l2.val){
            head.next = l1;
            pt1 = l1.next;
            pt2 = l2;
        }
        else {
            head.next = l2;
            pt1 = l2.next;
            pt2 = l1;
        }
        pt = pt.next;

        while(pt1 != null){
            if(pt1.val > pt.val){
                pt.next = pt1;
                pt = pt.next;
                pt1 = pt1.next;
            }
            else {
                ListNode node = pt1;
                pt1 = pt1.next;
                node.next = head.next;
                head.next = node;
            }
        }

        while(pt2 != null){
            pt = head;
            while(pt.next!= null && pt2.val >= pt.next.val ) {
                pt = pt.next;
            }
            if(pt.next == null)
                pt.next = pt2;
            else{
                ListNode node = pt2;
                pt2 = pt2.next;
                node.next = pt.next;
                pt.next=node;
            }

            if(pt.next.val > pt2.val){
                ListNode node = pt2;
                pt2 = pt2.next;
                node.next = head.next;
                head.next = node;
            }

        }
    return head.next;
    }
}
