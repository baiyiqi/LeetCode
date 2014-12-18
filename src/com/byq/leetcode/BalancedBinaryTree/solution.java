package com.byq.leetcode.BalancedBinaryTree;

/**
 * Created by yiqibai on 12/4/14.
 */
public class solution {

    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if (Math.abs(depth(root.left) - depth(root.right)) >1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int depth(TreeNode root){
        if(root == null)
            return 0;
        else
            return Math.max(depth(root.left), depth(root.right)) + 1;

    }
}
