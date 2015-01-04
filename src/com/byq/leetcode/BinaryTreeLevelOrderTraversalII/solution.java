package com.byq.leetcode.BinaryTreeLevelOrderTraversalII;

import javax.xml.soap.Node;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yiqibai on 1/3/15.
 */
public class solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            //vs
            return new ArrayList<List<Integer>>();
        else{
            Queue<TreeNode> tQueue = new ArrayDeque<TreeNode>();
            tQueue.add(root);
            List<List<Integer>> rt = new ArrayList<List<Integer>>();

            while (true){
                List<Integer> val = new ArrayList<Integer>();
                Queue<TreeNode> level = new ArrayDeque<TreeNode>();

                while(tQueue.size() > 0){
                    TreeNode node = tQueue.poll();
                    val.add(node.val);
                    if(node.left != null)
                        level.add(node.left);
                    if(node.right != null)
                        level.add(node.right);
                }
                if(level.size() > 0){
                    tQueue = level;
                    rt.add(0, val);
                }
                else break;
            }
        return rt;
        }
    }
}
