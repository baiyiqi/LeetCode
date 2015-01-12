package com.byq.leetcode.ClimbingStairs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiqibai on 12/30/14.
 */
public class solution {

    public static void main(String[] args){
       System.out.println(climbStairs1(4));

        System.out.println(climbStairs(4));


    }


    public static  int climbStairs(int n) {

        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        if(n == 2)
            return 2;

        int s1 = 1;
        int s2 =2;

        int t = 0;
        int i = 3;
        while(i < n + 1){
            t = s1 + s2;
            s1 = s2;
            s2 = t;
            i ++;
        }
        return t;
    }



    public static int climbStairs1(int n) {

        if(n ==  2)
            return 2;
        if(n ==1 )
            return 1;
        else
            return climbStairs1(n-2) + climbStairs1(n -1);
    }
}
