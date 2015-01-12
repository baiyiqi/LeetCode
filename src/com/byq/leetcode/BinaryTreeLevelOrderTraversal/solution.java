package com.byq.leetcode.BinaryTreeLevelOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yiqibai on 1/3/15.
 */
public class solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        else{
            Queue<TreeNode> treeQueue = new ArrayDeque<TreeNode>();
            treeQueue.add(root);

            List<List<Integer>> rt = new ArrayList<List<Integer>>();
            while(true){
                List<Integer> tlst = new ArrayList<Integer>();
                List<TreeNode> nlst = new ArrayList<TreeNode>();
                while(treeQueue.size() > 0){
                    TreeNode node = treeQueue.poll();
                    tlst.add(node.val);
                    nlst.add(node);
                }

                if(nlst.size() > 0){
                    rt.add(tlst);
                    for(TreeNode n : nlst){
                        if(n.left != null)
                            treeQueue.add(n.left);
                        if(n.right != null)
                            treeQueue.add(n.right);
                    }
                }
                else
                    break;
            }
            return rt;
        }
    }

}
