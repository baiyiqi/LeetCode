package com.byq.leetcode.PathSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yiqibai on 12/10/14.
 */
public class solution {
    Map<TreeNode, TreeNode> parent = new HashMap<TreeNode, TreeNode>();

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;

        if(root.left == null && root.right == null )
            if(sum - root.val == 0)
                return true;
            else return false;
        else
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);




    }
}
