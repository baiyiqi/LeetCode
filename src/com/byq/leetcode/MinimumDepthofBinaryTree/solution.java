package com.byq.leetcode.MinimumDepthofBinaryTree;

/**
 * Created by yiqibai on 12/3/14.
 */
public class solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;
        if(root.left != null && root.right != null )
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        if (root.left != null && root.right == null)
            return minDepth(root.left) + 1;
        else
            return minDepth(root.right) + 1;

    }
}
