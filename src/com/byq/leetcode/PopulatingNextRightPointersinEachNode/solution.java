package com.byq.leetcode.PopulatingNextRightPointersinEachNode;

/**
 * Created by yiqibai on 1/28/15.
 */
public class solution {

    public void connect(TreeLinkNode root) {
        TreeLinkNode parent = root;
        if(parent == null)
            return;
        TreeLinkNode parentleft = root.left;

        if(parentleft == null)
            return;
        while(parent.next != null){
            parent.left.next = parent.right;
            parent.right.next= parent.next.left;
            parent = parent.next;
        }
        if(parent.next == null)
            parent.left.next = parent.right;
        connect(parentleft);


    }

    public class TreeLinkNode {
             int val;
             TreeLinkNode left, right, next;
             TreeLinkNode(int x) { val = x; }
     }
}
