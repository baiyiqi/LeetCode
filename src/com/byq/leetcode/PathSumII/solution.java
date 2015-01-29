package com.byq.leetcode.PathSumII;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yiqibai on 1/29/15.
 */
public class solution {

    static List<List<Integer>> lst = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r = new TreeNode(-2);
        TreeNode rr = new TreeNode(-3);
        TreeNode rrr = new TreeNode(1);
        TreeNode rrrr = new TreeNode(3);
        TreeNode rrrrr = new TreeNode(-2);
        //TreeNode l = new TreeNode();
        TreeNode rrrrrr = new TreeNode(-1);

        //root.left = l;
        root.left = r;
        root.right = rr;

        r.left = rrr;
        r.right = rrrr;
        rr.left = rrrrr;
        rrr.left = rrrrrr;

        pathSum(root, -1);

        System.out.print(lst);

    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return lst;
        List<Integer> lst1 = new ArrayList<Integer>();
        func(root, sum, lst1 );
        return lst;

    }

    public static void func(TreeNode root, int sum, List<Integer> lst1 ){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            if((sum - root.val) == 0){
                lst1.add(root.val);
                lst.add(lst1);
                return;
            }
        }
        else{
                lst1.add(root.val);
                func(root.left, sum - root.val,  new ArrayList<Integer>(lst1));
                func(root.right, sum - root.val, new ArrayList<Integer>(lst1));

        }
    }
}
