package com.byq.leetcode.SumRoottoLeafNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yiqibai on 1/27/15.
 */
public class solution {


    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        Map<TreeNode, List<String>> sumMap = new HashMap<TreeNode, List<String>>();
        List<String> lst = numb(root, sumMap);
        int sum = 0;
        for(String s : lst)
            sum += Integer.parseInt(s);
        return sum;
    }

    public List<String> numb(TreeNode root,  Map<TreeNode, List<String>> sumMap){

        if(sumMap.containsKey(root)){
            return sumMap.get(root);
        }

        List<String> lst = new ArrayList<String>();
        if(root.left == null && root.right == null){
            lst.add(String.valueOf(root.val));
            sumMap.put(root, lst);
            return lst;
        }

        if(root != null){
            List<String> lv = numb(root.left, sumMap);
            List<String> rv = numb(root.right, sumMap);
            if(lv.size() > 0){
                for(String s : lv ){
                    lst.add(String.valueOf(root.val) + s);
                }
            }
            if(rv.size() > 0){
                for(String s : rv ){
                    lst.add(String.valueOf(root.val) + s);
                }
            }
            sumMap.put(root, lst);
        }

        return lst;
    }
}
