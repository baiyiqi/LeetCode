package com.byq.leetcode.BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {
    //中序 preorder recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        preorder(root, lst);
        return lst;
    }

    public void preorder(TreeNode node, List<Integer> lst){
        if(node != null){
            lst.add(node.val);
            preorder(node.left, lst);
            preorder(node.right, lst);
        }
    }

    //iteration
    public List<Integer> preorderTraversal1(TreeNode root){
        List<Integer> lst = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(root != null){
            lst.add(root.val);
            if(root.right != null)
                stack.push(root.right);
            root = root.left;

            if(root == null && !stack.empty())
                root = stack.pop();
        }

        return lst;
    }



}
