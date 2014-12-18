package com.byq.leetcode.RemoveNthNodeFromEndofList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yiqibai on 12/17/14.
 */
public class solution {
    public static void main(String[] args){

        ListNode l1 = new ListNode(1);


        removeNthFromEnd(l1, 1);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)
            return head;

        else {
            ListNode faster = head;
            ListNode slow = head;

            while(n > 0 && faster != null){
                faster = faster.next;
                n -=1;
            }
            if(faster == null)
                return slow.next;

            while (faster.next!=null){
                faster = faster.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
}
