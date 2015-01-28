package com.byq.leetcode.LinkedListCircle2;


/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {
    public static void main(String[] args){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    //ListNode n4 = new ListNode(4);

    n1.next = n2;
    //n2.next = n3;
    //n3.next = n4;
    System.out.println(detectCycle(n1).val);


}

    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;

        while(slow != null && slow.next!= null){
            if(slow.next.next == null)
                return null;
            if(slow.next.next == head)
                return slow;
            else{
                ListNode node = slow;
                slow = slow.next;
                node.next = head;
            }
        }
        return null;

    }
}
