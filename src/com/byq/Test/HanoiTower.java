package com.byq.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yiqibai on 1/23/15.
 */
public class HanoiTower {
    public static void move(int n, int source, int target, int middle) {
        if (n == 1) {
            System.out.printf("%d ==> %d\n", source, target);
            return;
        }

        move(n - 1, source, middle, target);
        move(1, source, target, middle);
        move(n - 1, middle, target, source);


    }

    public static void main(String[] args) {

        TreeNode node  = new TreeNode(1);

        List<TreeNode> lst = new ArrayList<TreeNode>();

        lst.add(new TreeNode(1));
        Queue<String> q = new ArrayDeque<String>();
        for(String s : q){
            System.out.println(s);

        }
        System.out.println(lst.contains(node));
        System.out.println(lst.contains("a"));
    }

    public static  boolean check(String s){
        if(s.length() == 1)
            return true;
        else{
            int hd = 0;
            int tl = s.length()-1;
            while(hd < tl){
                if(s.charAt(hd) == s.charAt(tl)){
                    hd +=1;
                    tl  -=1;
                }
                else
                    return false;
            }
            return true;
        }
    }

}
