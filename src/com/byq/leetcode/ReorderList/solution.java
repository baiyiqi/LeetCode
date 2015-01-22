package com.byq.leetcode.ReorderList;


import java.util.Stack;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        //ListNode n2 = new ListNode(2);
        //ListNode n3 = new ListNode(3);
        //ListNode n4 = new ListNode(4);

        //n1.next = n2;
        //n2.next = n3;
        //n3.next = n4;

        reorderList(n1);
        ListNode ptr = n1;
        while(ptr !=null){
            System.out.println(ptr.val);
            ptr = ptr.next;
        }

    }
    public static void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode ptr = head;
        while(ptr != null){
            stack.push(ptr);
            ptr = ptr.next;
        }

        ptr = head;
        while(ptr != null && !stack.empty() && ptr != stack.peek()){
            ListNode tail = stack.pop();
            ListNode nxt = ptr.next;
            if(nxt == tail){
                nxt.next = null;
                break;
            }

            ptr.next = tail;
            ptr.next.next = nxt;
            ptr = nxt;

            if(nxt == stack.peek()){
                ptr.next = null;
                break;
            }
        }

    }



}
