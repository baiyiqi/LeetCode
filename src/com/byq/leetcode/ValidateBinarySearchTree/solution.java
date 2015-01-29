package com.byq.leetcode.ValidateBinarySearchTree;

/**
 * Created by yiqibai on 1/29/15.
 */
public class solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-2147483648);
        TreeNode r = new TreeNode(2147483647);
        TreeNode rr = new TreeNode(-2147483648);
        //TreeNode rrr = new TreeNode(15);
        //TreeNode rrrr = new TreeNode(45);
        //TreeNode rrrrr = new TreeNode(-2);
        //TreeNode l = new TreeNode();
        //TreeNode rrrrrr = new TreeNode(-1);

        //root.left = l;
        root.right = r;

        r.left = rr;
        //rr.right = rrr;
        //rrr.right = rrrr;

        int[] arr= new int[4];

        System.out.print(isValidBST(root));

    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        TreeNode lnode = root.left;
        TreeNode rnode = root.right;
        boolean rst1 = isValidBST(lnode);
        boolean rst2 = isValidBST(rnode);

        while(lnode != null && lnode.right != null){
            lnode = lnode.right;
        }
        if(lnode != null)
            rst1 = rst1 && (lnode.val < root.val);
        while(rnode != null && rnode.left != null){
            rnode = rnode.left;
        }
        if(rnode != null)
            rst2 = rst2 && (rnode.val > root.val);

        return rst1 && rst2;
    }
}
