package com.byq.leetcode.SymmetricTree;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by yiqibai on 12/4/14.
 */
public class solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        else {
            return check(root.left, root.right);
        }
    }

    public boolean check(TreeNode l, TreeNode r){
        if(l == null && r != null)
            return false;
        if(l != null && r == null)
            return false;
        if(l== null && r == null)
            return true;
        if (l.val != r.val)
            return false;
        else
            return  check(l.left, r.right) && check(l.right, r.left);

    }


}
