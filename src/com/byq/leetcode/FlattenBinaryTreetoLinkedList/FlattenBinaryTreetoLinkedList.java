package com.byq.leetcode.FlattenBinaryTreetoLinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 1/29/15.
 */
public class FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        root.left = l;
        System.out.print(root.left.val);
        System.out.print(root.right.val);

    }


    //recursive
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;
        if(root.left != null){
            TreeNode rNode = root.right;
            TreeNode node = root.left;
            while(node.right != null)
                node = node.right;
            node.right = rNode;

            root.right = root.left;
            root.left = null;

        }
        flatten(root.right);
    }
}
