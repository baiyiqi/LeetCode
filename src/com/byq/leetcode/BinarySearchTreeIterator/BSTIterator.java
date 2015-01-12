package com.byq.leetcode.BinarySearchTreeIterator;

import java.util.Stack;

/**
 * Created by yiqibai on 1/12/15.
 */
public class BSTIterator {
    Stack<TreeNode> tStack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !tStack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tpNode = tStack.pop();
        if(tpNode.right!= null)
            pushAll(tpNode.right);
        return tpNode.val;
    }

    public void pushAll(TreeNode node){
        while(node != null ){
            tStack.push(node);
            node = node.left;
        }
    }
}
