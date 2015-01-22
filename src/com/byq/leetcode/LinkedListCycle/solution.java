package com.byq.leetcode.LinkedListCycle;

import com.byq.leetcode.ReorderList.*;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n1;
        n3.next = n4;
        System.out.println(hasCycle(n1));


    }


    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode start = head;
        ListNode ptr = head.next;

        while(ptr != null){
            ListNode flag = start;
            while(flag != ptr ){
                if(flag == ptr.next)
                    return true;
                flag = flag.next;
            }
            ptr = ptr.next;
        }
        return false;
    }
}
