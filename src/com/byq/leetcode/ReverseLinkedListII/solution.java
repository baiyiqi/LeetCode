package com.byq.leetcode.ReverseLinkedListII;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiqibai on 1/30/15.
 */
public class solution {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        //System.out.print(reverseBetween(n1, 2,3));

    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m == n )
            return head;
        ListNode ptr = head;
        ListNode prv = null;
        ListNode broker1 = null;
        ListNode broker2 = null;
        ListNode broker3 = null;

        ListNode nHead = new ListNode(100);
        nHead.next = null;

        int i = 1;
        while(ptr != null){
            if(i == m)
                broker1 = prv;
            if(i == n)
                broker2 = ptr.next;
            if(i >= m && i <=n){
                ListNode node = new ListNode(ptr.val);
                node.next = nHead.next;
                nHead.next = node;
                if(i == m)
                    broker3 = node;
            }
            prv = ptr;

            ptr = ptr.next;
            i++;
        }

        if(broker1 == null)
            head =nHead.next;
        else
            broker1.next = nHead.next;
        broker3.next = broker2;
        return head;
    }


}
