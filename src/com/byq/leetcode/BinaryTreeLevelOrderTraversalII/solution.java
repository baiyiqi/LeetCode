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
            return new ArrayList<List<Integer>>();
        else{
            Queue<TreeNode> tQueue = new ArrayDeque<TreeNode>();
            List<List<TreeNode>> tlist = new ArrayList<List<TreeNode>>();
            tQueue.add(root);
            List<List<Integer>> rt = new ArrayList<List<Integer>>();

            while (true){
                List<TreeNode> lv = new ArrayList<TreeNode>();
                while(tQueue.size() > 0)
                    lv.add(tQueue.poll());
                if(lv.size() > 0){
                    tlist.add(lv);
                    for(TreeNode n : lv){
                        if(n.left != null)
                            tQueue.add(n.left);
                        if(n.right != null)
                            tQueue.add(n.right);
                    }
                }else
                    break;
            }

            for(int i = tlist.size() -1; i >= 0 ; i --){
                List<TreeNode> tl = tlist.get(i);
                List<Integer> lev = new ArrayList<Integer>();
                for(TreeNode n : tl)
                    lev.add(n.val);
                rt.add(lev);
            }
            return rt;
        }
    }
}
