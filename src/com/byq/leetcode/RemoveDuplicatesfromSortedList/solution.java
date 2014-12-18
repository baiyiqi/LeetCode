package com.byq.leetcode.RemoveDuplicatesfromSortedList;

/**
 * Created by yiqibai on 12/11/14.
 */
public class solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode start = head;

        while(start.next !=null){

            if(start.val == start.next.val)
                start.next = start.next.next;
            else
                start = start.next;
        }
        return head;


    }
    public ListNode deleteDuplicates1(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode start = head;
        ListNode next = start.next;

        while(next!= null){
            if(start.val == next.val){
                next = next.next;
                start.next = next;
            }
            else {
                start = next;
                if(next.next != null)
                    next = next.next;
                else
                    break;
            }

        }
        return head;

    }
}
