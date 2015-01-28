package com.byq.leetcode.LinkedListCircle2;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution1 {
    public static void main(String[] args){
        ListNode n0 = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(-4);

        n3.next = n2;
        n2.next = n0;
        n0.next = n4;

        ListNode  a  = detectCycle(n3);
        System.out.println(a);
    }


    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        while(slow != null ){
            ListNode node = slow;
            slow = slow.next;
            if(slow != null && slow.next == head)
                return slow;
            node.next = head;
        }
        return null;

    }
}
