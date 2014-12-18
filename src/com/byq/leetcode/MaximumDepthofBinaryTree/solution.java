package com.byq.leetcode.MaximumDepthofBinaryTree;

/**
 * Created by yiqibai on 12/2/14.
 */
public class solution {

    public int maxDepth(TreeNode root) {

        if(root== null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;
        else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }

    }
}
