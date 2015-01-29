package com.byq.leetcode.UniqueBinarySearchTrees;

import com.byq.leetcode.ValidateBinarySearchTree.TreeNode;

/**
 * Created by yiqibai on 1/29/15.
 */
public class solution {
    public static void main(String[] args) {

        System.out.print(numTrees(3));

    }

    public static int numTrees(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        if(n ==2 )
            return 2;
        else{
            int total = 0;
            for(int i = 0; i < n; i++)
                total += numTrees(i) * numTrees(n-i-1);
            return total;
        }

    }
}
