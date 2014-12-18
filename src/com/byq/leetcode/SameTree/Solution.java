package com.byq.leetcode.SameTree;

/**
 * Created by yiqibai on 11/18/14.
 */

import apple.laf.JRSUIUtils;

import java.util.Stack;

/**
 * Definition for binary tree
 */

public class Solution {
    public static void main(String[] args){
        TreeNode t1 = null;
        TreeNode t2 = new TreeNode(0);
        System.out.println(isSameTree(t1,t2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if(p != null && q != null){
            if(p.val == q.val){
                if(p.left == null && q.left == null && p.right == null && q.right == null)
                    return true;
                if((p.left != null && q.left != null) || (p.right != null && q.right != null) )
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                else
                    return false;
            }
        }

        return false;

    }



    public class SolutionMJ {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null)
                return true;

            if((p == null && q != null) || (p != null && q == null))
                return false;

            return (p.val == q.val) && (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
        }
    }

}
