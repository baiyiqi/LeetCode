package com.byq.leetcode.LinkedListCycle;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {

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

    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
